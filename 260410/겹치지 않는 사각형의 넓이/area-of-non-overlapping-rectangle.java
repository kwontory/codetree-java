import java.util.Scanner;
public class Main {
    public static final int OFFSET = 1000;
    public static final int SIZE = OFFSET*2+1;
    public static int[][] plane = new int[SIZE][SIZE];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ax1 = sc.nextInt();
        int ay1 = sc.nextInt();
        int ax2 = sc.nextInt();
        int ay2 = sc.nextInt();
        int bx1 = sc.nextInt();
        int by1 = sc.nextInt();
        int bx2 = sc.nextInt();
        int by2 = sc.nextInt();
        int mx1 = sc.nextInt();
        int my1 = sc.nextInt();
        int mx2 = sc.nextInt();
        int my2 = sc.nextInt();

        fill(ax1,ay1,ax2,ay2);
        fill(bx1,by1,bx2,by2);
        fill(mx1,my1,mx2,my2);

        int area = 0;
        for(int i=ax1;i<ax2;i++) {
            for(int j=ay1;j<ay2;j++) {
                if(plane[i][j] == 1) area++;
            }
        } 
        for(int i=bx1;i<bx2;i++) {
            for(int j=by1;j<by2;j++) {
                if(plane[i][j] == 1) area++;
            }
        } 
        System.out.print(area);

    }
    public static void fill(int x1, int y1, int x2, int y2) {
        for(int i=x1;i<x2;i++) {
            for(int j=y1;j<y2;j++) {
                plane[i][j]++;
            }
        }
    }
}