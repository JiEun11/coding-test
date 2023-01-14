import java.util.*;

public class ExtractNum {

  public int solution(String s) {
    String answer = "";
    for(char c : s.toCharArray()){
      if(47 <= c && c <= 57){
        answer += c;
      }
    }

    return Integer.parseInt(answer); // parseInt하면 0208 -> 208이 된다.
  }

  public static void main(String[] args) {
    ExtractNum T = new ExtractNum();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    System.out.print(T.solution(str));
    kb.close();
  }
}
