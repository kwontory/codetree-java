import java.util.*;

public class Main {
    public static final int OFFSET = 100;
    public static int[] axis = new int[4];
    public static int[][] rec = new int[OFFSET*2+1][OFFSET*2+1];
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            for(int j=0;j<4;j++) {
                axis[j] = sc.nextInt() + OFFSET;  // x1,y1,x2,y2
            }
            fill(axis); // 사각형 채우기
        }
        int area = 0;
        for(int i=0;i<OFFSET*2+1;i++) {
            for(int j=0;j<OFFSET*2+1;j++) {
                area += rec[i][j];
            }
        }

        System.out.print(area);
    }

    public static void fill(int[] axis) {
        for(int i=axis[0];i<axis[2];i++) {
            for(int j=axis[1];j<axis[3];j++) {
                rec[i][j] = 1;
            }
        }
    }
}