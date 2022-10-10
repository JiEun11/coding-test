import java.util.*;

public class WordInSen {
  public String solution(String str) {
    String answer = "";
    int m = Integer.MIN_VALUE, pos; // 가장 작은 값으로 초기화
    while ((pos = str.indexOf(' ')) != -1) { // 띄어쓰기가 처음으로 발견되는 2리턴
      String tmp = str.substring(0, pos); // 0-4까지 잘라냄
      int len = tmp.length();
      if (len > m) {
        m = len;
        answer = tmp;
      }
      str = str.substring(pos + 1); // str 갱신
    }
    if (str.length() > m) // 마지막 단어 처리 필수
      answer = str;
    // String[] s = str.split(" ");
    // for (String x : s) {
    // int len = x.length();
    // if (len > m) {
    // m = len; // 최댓값 구하는 알고리즘
    // answer = x;
    // }
    // }

    return answer;
  }

  public static void main(String[] args) {
    WordInSen T = new WordInSen();
    Scanner kb = new Scanner(System.in);
    String str = kb.nextLine();
    System.out.println(T.solution(str));
    kb.close();
  }
}
