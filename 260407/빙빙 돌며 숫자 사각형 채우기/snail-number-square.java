import java.util.*;

public class Main {

    public static int n; // row
    public static int m; // col

    public static int[] dn = new int[] {0,1,0,-1}; // R: 0에서부터 시계방향
    public static int[] dm = new int[] {1,0,-1,0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        int[][] ans = new int[n][m];
        int x = 0, y = 0; // 초기 위치
        int dir = 0; // 초기 방향
        ans[x][y] = 1;
        for(int i=1;i<n*m;i++) {
            int nx = x + dn[dir];
            int ny = y + dm[dir];
            if(!inRange(nx,ny) || ans[nx][ny] != 0) {
                dir = (dir + 1) % 4;
            }
            x = x + dn[dir];
            y = y + dm[dir];
            ans[x][y] = i + 1;
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static boolean inRange(int x, int y) {
        return(0<=x && x<n && 0<=y && y<m);
    }
}