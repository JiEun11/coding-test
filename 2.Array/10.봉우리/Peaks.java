import java.util.Scanner;

public class Peaks {

    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    public int solution(int n, int[][] arr){
        int answer = 0;
        for(int i = 0; i<n; i++){
            for(int j =0; j<n; j++){
                boolean flag = true;    //봉우리 판별 플래그
                for(int k = 0; k<4; k++){      // 4방향 탐색
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny] >= arr[i][j]  ){
                        flag = false;
                        break;      // 더이상 볼 필요 없으니까
                    }
                }
                if(flag) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Peaks T = new Peaks();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j =0; j<n; j++){
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));
    }
}
