import java.util.Scanner;

public class Main {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // 상,우,하,좌
        int[] dx = {1,0,-1,0}; 
        int[] dy = {0,1,0,-1};

        int[][] grid = new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int result = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                int cnt = 0;
                for(int k=0;k<4;k++) { // 인접한 칸 확인
                    int x = i + dx[k], y = j + dy[k];
                    if(inRange(x,y) && grid[x][y] == 1) {
                        cnt++;
                    }
                }
                if(cnt >= 3) result ++;
            }
        }
        System.out.print(result);
    }

    public static boolean inRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }
}