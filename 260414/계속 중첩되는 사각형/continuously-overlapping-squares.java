import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] plane = new int[201][201];
        for(int i = 0;i < N;i++) {
            int x1 = sc.nextInt() + 100;
            int y1 = sc.nextInt() + 100;
            int x2 = sc.nextInt() + 100;
            int y2 = sc.nextInt() + 100;
            int color = 0;
            if(i%2==0) { // 1: red
                color = 1;
            } else { // 2: blue
                color = 2;
            }

            for(int j = x1;j < x2;j++) {
                for(int k = y1;k < y2;k++) {
                    plane[j][k] = color;
                }
            }
        }

        int ans = 0;
        for(int j = 0;j < 201;j++) {
            for(int k = 0;k < 201;k++) {
                if(plane[j][k] == 2) ans++;
            }
        }

        System.out.print(ans);

    }
}