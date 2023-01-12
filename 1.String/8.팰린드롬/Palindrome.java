import java.util.*;

public class Palindrome {
  public String Solution(String s) {
//    String answer = "YES";
//    String refinedStr = s.replaceAll("[^a-zA-Z]","");
//    refinedStr = refinedStr.toLowerCase();
//    int len = refinedStr.length();
//    for(int i = 0; i < len/2; i++){
//      if(refinedStr.charAt(i) != refinedStr.charAt(len-i-1)) return "NO";
//    }
    String answer = "NO";
    s = s.toUpperCase().replaceAll("[^A-Z]", "");
    String tmp = new StringBuilder(s).reverse().toString();
    if(s.equals(tmp)) answer="YES";
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
