import java.util.*;

public class PalindromeString {

  public String solution(String str) {
    String answer = "NO";
    String tmp = new StringBuilder(str).reverse().toString();
    if (str.equalsIgnoreCase(tmp))
      answer = "YES";
    // String answer = "YES";
    // str = str.toUpperCase();
    // int len = str.length();
    // for (int i = 0; i < len / 2; i++) {
    // if (str.charAt(i) != str.charAt(len - i - 1))
    // return "NO";
    // }
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
