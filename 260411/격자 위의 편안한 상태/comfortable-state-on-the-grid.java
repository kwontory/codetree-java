import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //  스크린 기준
        int[] dx = {0,1,0,-1};
        int[] dy = {-1,0,1,0};
        int[][] g = new int[n+1][n+1];

        for(int i=0;i<m;i++) { // m개의 좌표
            int x = sc.nextInt();
            int y = sc.nextInt();
            g[x][y] = 1;
            int cnt = 0;
            for(int j=0;j<4;j++) {
                if(inRange(x+dx[j],y+dy[j],n) && g[x+dx[j]][y+dy[j]] == 1) cnt++;
            }
            if(cnt == 3) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }

        }
    }

    public static boolean inRange(int x, int y, int n) {
        return x > 0 && x <= n && y > 0 && y <= n;
    }
}