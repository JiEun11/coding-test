import java.util.*;

class ReverseSomeWord {

  public String solution(String str) {
    String answer;
    char[] s = str.toCharArray();
    int lt = 0, rt = str.length() - 1;
    while(lt < rt) {
//      char tmp = s[lt];
//      if((65 <= tmp && tmp <= 90) || (97 <= tmp && tmp <= 122) ){
//        s[lt] = s[rt];
//        s[rt] = tmp;
//      }
//      lt++;
//      rt--;
      if(!Character.isAlphabetic(s[lt])) lt++;
      else if(!Character.isAlphabetic(s[rt])) rt--;
      else{
        char tmp = s[lt];
        s[lt] = s[rt];
        s[rt] = tmp;
        lt++;
        rt--;
      }
    }
    answer = String.valueOf(s);
    return answer;
  }

  public static void main(String[] args) {
    ReverseSomeWord T = new ReverseSomeWord();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    System.out.println(T.solution(str));
    kb.close();
  }
}
