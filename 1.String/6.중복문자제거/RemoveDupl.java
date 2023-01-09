import java.util.*;

public class RemoveDupl {

  public String solution(String str) {
    String answer = "";
    for(char word : str.toCharArray()){
      String letter = Character.toString(word);
      if(!answer.contains(letter)){
        answer += letter;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    RemoveDupl T = new RemoveDupl();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    System.out.print(T.solution(str));
    kb.close();
  }
}
