import java.util.Scanner;

public class Main {
    // 상(0), 우(1), 하(2), 좌(3) 순서 (시계방향)
    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] map = new char[n][n];

        for (int i = 0; i < n; i++) {
            map[i] = sc.next().toCharArray();
        }

        int k = sc.nextInt();
        
        // 1. 시작 위치와 초기 방향 설정
        int r = 0, c = 0, dir = 0;
        if (k <= n) {
            r = 0; c = k - 1; dir = 2; // 위 -> 아래
        } else if (k <= 2 * n) {
            r = k - n - 1; c = n - 1; dir = 3; // 오른쪽 -> 왼쪽
        } else if (k <= 3 * n) {
            r = n - 1; c = 3 * n - k; dir = 0; // 아래 -> 위
        } else {
            r = 4 * n - k; c = 0; dir = 1; // 왼쪽 -> 오른쪽
        }

        // 2. 시뮬레이션 시작
        int count = 0;
        while (r >= 0 && r < n && c >= 0 && c < n) {
            if (map[r][c] == '/') {
                // / 거울: 0<->1, 2<->3 (XOR 연산 활용 가능)
                if (dir == 0) dir = 1;
                else if (dir == 1) dir = 0;
                else if (dir == 2) dir = 3;
                else if (dir == 3) dir = 2;
            } else {
                // \ 거울: 0<->3, 1<->2
                if (dir == 0) dir = 3;
                else if (dir == 1) dir = 2;
                else if (dir == 2) dir = 1;
                else if (dir == 3) dir = 0;
            }
            
            count++; // 튕김 횟수 증가
            // 다음 칸으로 이동
            r += dr[dir];
            c += dc[dir];
        }

        System.out.println(count);
    }
}