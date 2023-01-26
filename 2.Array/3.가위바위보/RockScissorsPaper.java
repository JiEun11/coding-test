import java.util.*;

public class RockScissorsPaper {
  public String solution(int n, int[] a, int[] b) {
    String answer = "";

    for(int i = 0; i < n; i++){
      if(a[i]==1 && b[i]==3 || a[i]==2 && b[i]==1 || a[i]==3 && b[i]==2){
        answer+= "A";
      }else if(a[i]==b[i]){ //비겼을 경우
        answer+="D";
      }else if(a[i]==1 && b[i]==2 || a[i]==2 && b[i]==3 || a[i]==3 && b[i]==1){
        answer+= "B";
      }

    }

    return answer;
  }

  public static void main(String[] args) {
    RockScissorsPaper T = new RockScissorsPaper();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = kb.nextInt();
    }
    for (int i = 0; i < n; i++) {
      b[i] = kb.nextInt();
    }
    for (char x : T.solution(n, a, b).toCharArray())
      System.out.println(x);
    kb.close();
  }
}
