import java.util.*;

public class Main {
    public static int n, m; // 격자 크기..
    public static int[] dx, dy;
    public static int[][] snail, visited;
    public static int x,y; // 현재 위치
    public static boolean canGo(int x, int y) {
        // 1. x,y가 격자 범위 안에 들어오고
        // 2. 이동하려는 위치에 뱀이 없고
        // 3. 이미 방문한 지점이 아니면
        // 진행할 수 있음.
        return inRange(x,y) && snail[x][y] == 1 && visited[x][y] == 0;
    }

    public static boolean inRange(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        n = sc.nextInt(); // 격자크기
        m = sc.nextInt();
        Queue<int[]> q = new LinkedList<>(); // x,y 좌표 배열 담기..        
        // 스크린 좌표계
        dx = new int[] {0,1,0,-1}; // 북동남서
        dy = new int[] {-1,0,1,0}; 

        snail = new int[n][m];
        visited = new int[n][m];

        // 좌측 상단이 0,0... 우측 하단이 n-1,m-1
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                snail[i][j] = sc.nextInt();
                // 뱀이 없으면 1, 뱀이 있으면 0..
            }
        }

        x = 0; y = 0; // 초기위치..
        q.add(new int[] {x,y});
        visited[x][y] = 1;
        while(!q.isEmpty()) { // 큐가 비워질 때까지
            for(int i=0;i<4;i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];
                if(canGo(newX, newY)) q.add(new int[] {newX, newY});
            }
            int[] xy = q.poll(); // 가장 먼저 나올 곳 꺼내고
            x = xy[0];
            y = xy[1];
            // System.out.printf("%d %d", xy[0], xy[1]);
            visited[x][y] = 1; // 방문표시...
        }
        // for(int i=0;i<n;i++) {
        //     for(int j=0;j<m;j++) {
        //         System.out.print(visited[i][j]);
        //     }
        //     System.out.println();
        // }
        System.out.println(visited[n-1][m-1]);
    }    
}