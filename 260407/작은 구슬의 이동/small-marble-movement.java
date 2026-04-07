import java.util.*;

public class Main {
    public static int n, t, r, c, d;
    public static int[] dx = new int[] {1,0,0,-1}; // U,R,L,D
    public static int[] dy = new int[] {0,1,-1,0};

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        t = sc.nextInt();

        // 초기 위치, 방향
        r = sc.nextInt() - 1; 
        c = sc.nextInt() - 1;
        d = getDir(sc.next().charAt(0));

        for(int i=0;i<t;i++) { // t초 동안..
            r = r + dx[d];
            c = c + dy[d];
            if(!inRange(r,c)) {
                r = r - dx[d];
                c = c - dy[d];
                d = 3 - d;
            }
        }

        System.out.printf("%d %d", r + 1, c + 1);
    }

    public static int getDir(char d) {
        if(d == 'U') {
            return 0;
        } else if(d == 'R') {
            return 1;
        } else if(d == 'L') {
            return 2;
        } else {
            return 3;
        }
    }

    public static boolean inRange(int x, int y) {
        return (0<=x && x<n && 0<=y && y<n);
    }

}