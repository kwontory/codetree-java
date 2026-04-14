import java.util.*;

public class Main {
    public static final int OFFSET = 1000;
    public static final int MAX_R = 2000;
    public static int[][] plane = new int[MAX_R + 1][MAX_R + 1];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 첫 번째
        int x1 = sc.nextInt() + OFFSET;
        int y1 = sc.nextInt() + OFFSET;
        int x2 = sc.nextInt() + OFFSET;
        int y2 = sc.nextInt() + OFFSET;
        
        // 인덱스 주의..
        for(int i = x1; i < x2; i++) {
            for(int j = y1; j < y2; j++) {
                plane[i][j] = 1;
            }
        }

        // 두 번째
        int x3 = sc.nextInt() + OFFSET;
        int y3 = sc.nextInt() + OFFSET;
        int x4 = sc.nextInt() + OFFSET;
        int y4 = sc.nextInt() + OFFSET;
        
        for(int i = x3; i < x4; i++) {
            for(int j = y3; j < y4; j++) {
                plane[i][j] = 2;
            }
        }

        // 남아있는 1
        int minX = MAX_R, maxX = 0, minY = MAX_R, maxY = 0;
        boolean found = false;

        for(int i = 0; i <= MAX_R; i++) {
            for(int j = 0; j <= MAX_R; j++) {
                if(plane[i][j] == 1) {
                    found = true;
                    if(i < minX) minX = i;
                    if(i > maxX) maxX = i;
                    if(j < minY) minY = j;
                    if(j > maxY) maxY = j;
                }
            }
        }

        if(!found) {
            System.out.print(0);
        } else {
            // 경계값의 차이에 1을 더해 길이를 구하고 곱함
            int width = maxX - minX + 1;
            int height = maxY - minY + 1;
            System.out.print(width * height);
        }
    }
}