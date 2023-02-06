import java.util.ArrayList;
import java.util.Scanner;

public class ReversePrime {

    public boolean isPrime(int n){
        boolean isPrime = true;
        // i : num에 나눌 값
        for(int i = 2; i<= n/2; i++){
            // 순차적으로 i를 num에 나누어본다.
            if(n%i==0){
                // num이 i로 나눠져 나머지가 0이 되면 isPrime에 false(소수가 아님)을 입력한다.
                isPrime = false;
                // 이미 1과 자기 자신 외에 다른 수로도 나눠지는 합성수임을 알았으므로 for문 빠져나간다.
                break;
            }
        }
        return isPrime;
    }

    public int getReverseNum(int n){
        int changedNum = 0;
        while(n!=0){
            changedNum = changedNum * 10 + n % 10;
            n /= 10;
        }
        return changedNum;
    }

    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<n; i++){
            int reverseNum = getReverseNum(arr[i]);
            if(isPrime(reverseNum)){
                answer.add(reverseNum);
            }
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
