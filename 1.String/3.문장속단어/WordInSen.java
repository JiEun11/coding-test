import java.util.*;

public class WordInSen {
  public String solution(String str) {
    String answer = "";
    int lengthCount = Integer.MIN_VALUE;
    int pos = 0;
    /*String[] wordList = str.split(" ");
    for(String word : wordList){
      int len = word.length();
      if(len > lengthCount){
        lengthCount = len;
        answer = word;
      }
    }*/

    while((pos=str.indexOf(' '))!= -1){ // 띄어쓰기 발견 안 되면 -1 return
      String tmp = str.substring(0, pos);
      int len = tmp.length();
      if(len > lengthCount) {
        lengthCount = len;
        answer = tmp;
      }
      str = str.substring(pos+1);   // str 갱신
    }
    if(str.length() > lengthCount){
      answer = str;
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
