import java.util.*;

public class Main {
    public static final int OFFSET = 1000;
    public static int[][] plane = new int[OFFSET*2+1][OFFSET*2+1];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1,y1,x2,y2;
        x1 = sc.nextInt() + OFFSET;
        y1 = sc.nextInt() + OFFSET;
        x2 = sc.nextInt() + OFFSET;
        y2 = sc.nextInt() + OFFSET;
        for(int i=x1;i<=x2;i++) {
            for(int j=y1;j<=y2;j++) {
                plane[i][j] = 1;
            }
        }

        x1 = sc.nextInt() + OFFSET;
        y1 = sc.nextInt() + OFFSET;
        x2 = sc.nextInt() + OFFSET;
        y2 = sc.nextInt() + OFFSET;
        for(int i=x1;i<=x2;i++) {
            for(int j=y1;j<=y2;j++) {
                plane[i][j] = 2;
            }
        }
        int ans = 0;
        for(int i=0;i<OFFSET*2+1;i++) {
            for(int j=0;j<OFFSET*2+1;j++) {
                if(plane[i][j] == 1) ans++;
            }
        }

        System.out.print(ans);
    }
}