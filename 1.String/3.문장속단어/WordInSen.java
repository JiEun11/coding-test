import java.util.*;

public class WordInSen {
  public String solution(String str) {
    String answer = "";
    int m = Integer.MIN_VALUE; // 가장 작은 값으로 초기화
    String[] s = str.split(" ");
    for (String x : s) {
      int len = x.length();
      if (len > m) {
        m = len; // 최댓값 구하는 알고리즘
        answer = x;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    WordInSen T = new WordInSen();
    Scanner kb = new Scanner(System.in);
    String str = kb.nextLine();
    System.out.println(T.solution(str));
  }
}
