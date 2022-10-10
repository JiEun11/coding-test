import java.util.*;

public class ChangeTo {

  public String solution(String str) {
    String answer = "";
    // A : 65 - 90
    // a : 97 - 122
    for (char x : str.toCharArray()) {
      // if (Character.isLowerCase(x)) {
      // answer += Character.toUpperCase(x);
      // } else {
      // answer += Character.toLowerCase(x);
      // }
      if (x >= 65 && x <= 90) {
        answer += (x - 32); // 소문자 -> 대문자
      } else {
        answer += (x + 32); // 대문자 -> 소문자
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    ChangeTo T = new ChangeTo();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    System.out.print(T.solution(str));
    kb.close();
  }
}