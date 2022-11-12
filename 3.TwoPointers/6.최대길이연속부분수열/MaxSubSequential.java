import java.util.Scanner;

public class MaxSubSequential {

    public int solution(int n, int k, int[] arr){
        int answer = 0, cnt = 0, lt = 0; // 0을 1로 바꾼 횟수 k보다
        for(int rt = 0; rt < n; rt++){
            if(arr[rt]==0) cnt++;
            while(cnt > k){
                if(arr[lt]==0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }
        return answer;
    }

    public static void main(String[] args) {
        MaxSubSequential T = new MaxSubSequential();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, k, arr));

        kb.close();
    }
}
