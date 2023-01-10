import java.util.*;

public class PalindromeString {

  public String solution(String str) {
    String answer = "NO";
    int lt = 0;
    int rt = str.length()-1;
    String[] strArr = str.split("");
    while(lt < rt){
      String left = strArr[lt].toLowerCase();
      String right = strArr[rt].toLowerCase();

      if(left.equals(right)){
        lt++;
        rt--;
        answer = "YES";
      }else{
        break;
      }
    }
    return answer;

  }

  public static void main(String[] args) {
    PalindromeString T = new PalindromeString();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    System.out.println(T.solution(str));
    kb.close();
  }
}
