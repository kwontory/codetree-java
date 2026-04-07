import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // dx, dy
        // 0 E 동, 1 S 남, 2 W 서, 3 N 북
        int[] dx = {1,0,-1,0};
        int[] dy = {0,-1,0,1};
        int x = 0, y = 0; // 초기 위치 (0,0)
        int dir;

        for (int i = 0; i < n; i++) {
            char cdir = sc.next().charAt(0);
            int distance = sc.nextInt();
            // Please write your code here.
            if(cdir == 'E') {
                dir = 0;
            } else if(cdir == 'S') {
                dir = 1;
            } else if(cdir == 'W') {
                dir = 2;
            } else {
                dir = 3;
            }
            // 좌표 계산
            x += dx[dir]*distance;
            y += dy[dir]*distance;
        }

        System.out.printf("%d %d", x, y);
    }
}