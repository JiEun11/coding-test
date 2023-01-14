import java.util.*;

public class ExtractNum {

  public int solution(String s) {
    /*String answer = "";
    for(char c : s.toCharArray()){
      if(47 <= c && c <= 57){
        answer += c;
      }
    }
    return I*/nteger.parseInt(answer); // parseInt하면 0208 -> 208이 된다.

    /*int answer = 0;
    for(char x : s.toCharArray()){
      if(x>=48 && x<=57){
        answer = answer * 10 + (x-48);
      }
    }
    return answer;*/

    String answer = "";
    for(char x : s.toCharArray()){
      if(Character.isDigit(x)){
        answer += x;
      }
    }
    return Integer.parseInt(answer);
  }

  public static void main(String[] args) {
    ExtractNum T = new ExtractNum();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    System.out.print(T.solution(str));
    kb.close();
  }
}
