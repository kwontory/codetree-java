import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0; // 초기 위치 0, 0
        int y = 0;

        int[] dx = {-1,0,0,1}; // W,S,N,E
        int[] dy = {0,1,-1,0};

        int time = 0;
        int ans = -1;
        boolean stop = false;
        for(int i=0;i<n;i++) {
            if(stop) break;
            char dir = sc.next().charAt(0);
            int d = getDir(dir);
            int dis = sc.nextInt();
            for(int j=1;j<=dis;j++) {
                x = x + dx[d];
                y = y + dy[d];
                time++;
                if(x == 0 && y == 0) {
                    ans = time;
                    stop = true;
                    break;
                }
            }
        }

        System.out.print(ans);


    }

    public static int getDir(char d) {
        if(d == 'W') return 0;
        else if(d == 'S') return 1;
        else if(d == 'N') return 2;
        else return 3;
    }
}