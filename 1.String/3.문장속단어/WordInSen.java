import java.util.*;

public class WordInSen {
  public String solution(String str) {
    String answer = "";
    int lengthCount = Integer.MIN_VALUE;
    String[] wordList = str.split(" ");
    for(String word : wordList){
      int len = word.length();
      if(len > lengthCount){
        lengthCount = len;
        answer = word;
      }
    }

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
