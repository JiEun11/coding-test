import java.util.Scanner;

public class PrimeNumber {

    public int solution(int n){
        int answer = 0;
        int[] count = new int[n];
        int sum = 1;
        for(int i=2; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    count[j-1]=sum;
                    sum++;
                }
            }
        }
        System.out.println(count.toString());
        return answer;
    }

    public static void main(String[] args) {
        PrimeNumber T = new PrimeNumber();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
