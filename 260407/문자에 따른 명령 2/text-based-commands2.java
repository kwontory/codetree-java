import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);        
        // L, R에서 방향 전환
        // F에서 해당 방향으로 이동
        // 0 북 1 동 2 남 3 서
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};
        int x = 0, y = 0; // 초기 위치 (0,0)
        int dir = 0; // 초기 방향 북쪽

        char[] instructions = sc.next().toCharArray();

        for(int i=0;i<instructions.length;i++) {
            if(instructions[i] == 'R') {
                dir = (dir + 1) % 4;
            } else if (instructions[i] == 'L') {
                dir = (dir + 3) % 4;
            } else { // F 해당 방향으로 이동
                x = x + dx[dir];
                y = y + dy[dir];
            }
        }

        System.out.printf("%d %d", x, y);
    }
}