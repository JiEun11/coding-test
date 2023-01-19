import java.util.*;

public class Secure {
  public String solution(int n, String s) {
    String answer = "";
    /*for(int i = 0; i < n*7; i+=7){
      String splitStr = s.substring(i,i+7);
      String BinaryStr = splitStr.replace("#","1").replace("*","0");
      int asciiNum = Integer.valueOf(BinaryStr, 2);
      char ch = (char)asciiNum;
      answer += String.valueOf(ch);
    }*/
    for(int i=0; i<n; i++){
      String tmp = s.substring(0,7).replace('#','1').replace('*','0');
      int num = Integer.parseInt(tmp, 2);
      answer += (char)num;
      s = s.substring(7);
    }
    return answer;
  }

  public static void main(String[] args) {
    Secure T = new Secure();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    String str = kb.next();
    System.out.println(T.solution(n, str));

    kb.close();
  }
}
