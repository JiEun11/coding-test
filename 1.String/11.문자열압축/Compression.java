import java.util.*;

public class Compression {
  public String solution(String s) {
    String answer = "";
    /*int count = 0;
    char c = s.charAt(0);
    answer += c;
    for(char letter : s.toCharArray()){
      if(c == letter){
        count++;
      }else{
        if(count!=0){
          answer+= count;
          count = 0;
          answer+= letter;
        }
      }
      c = letter;
    }*/
    s = s + " ";
    int cnt = 1;
    for(int i = 0 ; i < s.length()-1; i++){
      if(s.charAt(i)==s.charAt(i+1)){
        cnt++;
      }else{
        answer += s.charAt(i);
        if(cnt > 1){
          answer += String.valueOf(cnt);
          cnt = 1;
        }
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    Compression T = new Compression();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    System.out.println(T.solution(str));
    kb.close();
  }
}
