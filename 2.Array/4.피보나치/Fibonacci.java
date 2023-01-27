import java.util.*;

public class Fibonacci {
  public int[] solution(int n) {
    /*  배열 쓰지 말고 손코딩 하라고 했을 경우
    int a=1, b=1, c;
    for(int i =2; i<n; i++){
      c = a + b;
      a = b;
      b = c;
    }*/
    int[] answer = new int[n];
    answer[0] = 1;
    answer[1] = 1;

    for(int i=2; i<n; i++){
      answer[i] = answer[i-2] + answer[i-1];
    }
    return answer;
  }

  public static void main(String[] args) {
    Fibonacci T = new Fibonacci();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    T.solution(n);
    for (int x : T.solution(n))
      System.out.print(x + " ");
    kb.close();
  }
}
