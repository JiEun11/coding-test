import java.util.*;

public class ChangeTo {

  public String solution(String str) {
    String answer = "";
    for (char x : str.toCharArray()) {
      if (Character.isLowerCase(x)) {
        answer += Character.toUpperCase(x);
      } else {
        answer += Character.toLowerCase(x);
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    ChangeTo T = new ChangeTo();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    System.out.print(T.solution(str));
  }
}