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


        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();
            // Please write your code here.
            switch(direction) {
                case 'E' :
                    x += dx[0]*distance;
                    y += dy[0]*distance;
                    break;
                case 'S' :
                    x += dx[1]*distance;
                    y += dy[1]*distance;
                    break;
                case 'W' :
                    x += dx[2]*distance;
                    y += dy[2]*distance;
                    break;
                case 'N' :
                    x += dx[3]*distance;
                    y += dy[3]*distance;
                    break;
            }
        }

        System.out.printf("%d %d", x, y);
    }
}