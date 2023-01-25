import java.util.*;

public class SeeStudents {

  public int solution(int n, int[] arr) {
    int answer = 1;
    int max = arr[0];
    for(int height: arr){
      if(max < height){
        answer++;
        max = height;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    SeeStudents T = new SeeStudents();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = kb.nextInt();
    }
    System.out.print(T.solution(n, arr));

    kb.close();
  }
}
