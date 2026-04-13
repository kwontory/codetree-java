import java.util.*;

public class Main {
    public static final int OFFSET = 100;
    public static int[][] plane = new int[OFFSET*2+1][OFFSET*2+1];
    public static int width = 8;
    public static int height = 8;
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for(int i=0;i<N;i++) {
            int x = sc.nextInt() + OFFSET;
            int y = sc.nextInt() + OFFSET;
            for(int j=x;j<x+height;j++) {
                for(int k=y;k<y+width;k++) {
                    plane[j][k] = 1;
                }
            }
        }

        int result = 0;
        for(int j=0;j<OFFSET*2+1;j++) {
            for(int k=0;k<OFFSET*2+1;k++) {
                result += plane[j][k];
            }
        }

        System.out.print(result);
    }
}