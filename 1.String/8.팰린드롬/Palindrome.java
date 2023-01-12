import java.util.*;

public class Palindrome {
  public String Solution(String s) {
    String answer = "YES";
    String refinedStr = s.replaceAll("[^a-zA-Z]","");
    System.out.println(refinedStr);
    refinedStr = refinedStr.toLowerCase();
    int len = refinedStr.length();
    for(int i = 0; i < len/2; i++){
      if(refinedStr.charAt(i) != refinedStr.charAt(len-i-1)) return "NO";
    }
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
