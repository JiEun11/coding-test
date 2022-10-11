import java.util.*;

public class ExtractNum {

  public int solution(String s) {
    // int answer = 0;
    String answer = "";
    for (char x : s.toCharArray()) { // 문자열 배열로 만들기
      // if (x >= 48 && x <= 57) { // 이 사이에 있다는 건 문자라는 의미
      // answer = answer * 10 + (x - 48);
      // }
      if (Character.isDigit(x)) {
        answer += x;
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
