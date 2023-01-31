import java.util.Scanner;

public class PrimeNumber {

    public int solution(int n){
        int answer = 0;
        int[] count = new int[n+1];
        for(int i=2; i <=n; i++){
            if(count[i]==0){
                answer++;
                for(int j=i; j<=n; j=j+i){  // j는 i의 배수니까
                    count[j]=1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        PrimeNumber T = new PrimeNumber();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
