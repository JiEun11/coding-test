import java.util.Scanner;

public class SumMax {

    public int solution(int n, int[][] arr){
        int answer = Integer.MIN_VALUE;
        int sum1 = Integer.MIN_VALUE;
        int sum2 = Integer.MIN_VALUE;
        int sum3 = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                sum1 += arr[i][j];   // 행의 합
                sum2 += arr[j][i];   // 열의 합
                if(i==j){
                    sum3 += arr[i][j];
                }
            }
            answer = Math.max(sum1, sum2);
            answer = Math.max(answer, sum3);
        }

        return answer;
    }

    public static void main(String[] args){
        SumMax T = new SumMax();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for(int i =0; i< n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));
    }
}
