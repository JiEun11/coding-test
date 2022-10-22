import java.util.ArrayList;
import java.util.Scanner;

public class ReversePrime {

    public boolean isPrime(int num){
        if(num == 1) return false;
        for(int i = 2; i < num; i++){
            if(num % i==0) return false;
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<n; i++){
            int tmp = arr[i];
            int res = 0 ;   // 뒤집힌 수 저장할 변수
            while(tmp > 0){
                int t = tmp % 10;   // 한 자리씩 뽑아서 저장할 변수
                res = res * 10 + t; // 뒤집힌 수
                tmp = tmp/10;   // 뽑은 일의 자리 제외한 수
            }
            if(isPrime(res)) answer.add(res);

        }
        return answer;
    }

    public static void main(String[] args){
        ReversePrime T = new ReversePrime();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        for(int x : T.solution(n, arr)){
            System.out.println(x + " ");
        }
    }
}
