import java.util.*;

public class Palindrome {
  public String Solution(String s) {
    String answer = "NO";
    s = s.toUpperCase().replaceAll("[^A-Z]", ""); // A-Z까지가 아니면 이라는 정규식
    String tmp = new StringBuilder(s).reverse().toString();
    if (s.equals(tmp))
      answer = "YES";

    return answer;
  }

  public static void main(String[] args) {
    Palindrome T = new Palindrome();
    Scanner kb = new Scanner(System.in);
    String str = kb.nextLine();
    System.out.print(T.Solution(str));
    kb.close();
  }
}
