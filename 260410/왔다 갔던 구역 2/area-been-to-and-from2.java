import java.util.*;

public class Main {
    public static final int OFFSET = 1000;
    public static final int ASCII_CODE = 128; // 0 ~ 127
    public static int[] lines = new int[OFFSET*2+1];
    public static int base = 0 + OFFSET; // 초기값
    public static int[] dx = new int[ASCII_CODE];

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 이동 횟수
        dx['L'] = -1;
        dx['R'] = 1;
        
        for(int i=0;i<n;i++) {
            int x = sc.nextInt(); // 이동 거리
            char dir = sc.next().charAt(0); // 이동 방향
            move(x,dir);
        }

        int cnt = 0;
        for(int i=0;i<lines.length;i++) {
            if(lines[i] > 1) cnt++;
        }

        System.out.print(cnt);
    }

    public static void move(int x, char dir) {
        int next = base + x*dx[dir]; // base에 OFFSET 처리함

        if(base < next) {
            for(int i=base;i<next;i++) { // 지나간 영역 -> 점이 아니라 선분, 경계값 포함X
                lines[i]++;
            }
        } else {
            for(int i=next;i<base;i++) {
                lines[i]++;
            }
        }
        // 위치 이동
        base = next;
    }
}