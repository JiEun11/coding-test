import java.util.*;

public class ReverseWord {
  public ArrayList<String> solution(int n, String[] str) {
    ArrayList<String> answer = new ArrayList<>();

    for(int i = 0; i < n; i++){
      StringBuffer sb = new StringBuffer(str[i]);
      String reversedStr = sb.reverse().toString();
      answer.add(reversedStr);
    }
    return answer;

  }

  public static void main(String[] args) {
    ReverseWord T = new ReverseWord();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    String[] str = new String[n];
    for (int i = 0; i < n; i++) {
      str[i] = kb.next();
    }
    for (String x : T.solution(n, str)) {
      System.out.println(x);
    }

    kb.close();
  }

}
