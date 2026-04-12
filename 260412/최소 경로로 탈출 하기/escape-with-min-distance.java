import java.util.*;
public class Main {
    public static int n,m; // 격자 크기
    public static int[][] snails, steps, visited;
    public static int[] dx, dy;

    public static boolean canGo(int x, int y) {
        // 1. 격자범위 안에 오고,
        // 2. 뱀이 없고(1),
        // 3. 방문한 적이 없으면(0) 이동 가능
        return inRange(x,y) && snails[x][y] == 1 && visited[x][y] == 0;
    }

    public static boolean inRange(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        snails = new int[n][m];
        steps = new int[n][m];
        visited = new int[n][m];

        // Arrays.fill() 1차원 배열만 채워줌
        for(int i=0;i<n;i++) {
            Arrays.fill(steps[i],-1); // -1: 이동불가, 0이상: 거리
        }

        dx = new int[] {0,1,0,-1}; // 스크린좌표: 위,오른쪽,아래,왼쪽
        dy = new int[] {-1,0,1,0};

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                snails[i][j] = sc.nextInt();
        
        // 가중치 없는 최단 거리 탐색
        Queue<int[]> q = new LinkedList<>();
        
        // 시작위치 처리
        q.add(new int[] {0,0}); // 시작위치 넣고 시작
        visited[0][0] = 1;
        steps[0][0] = 0; // 현재 위치 거리 0
        while(!q.isEmpty()) { // q에 값이 있을 때만 진행
            // 현재 좌표..
            int[] currXY = q.poll();
            int currX = currXY[0];
            int currY = currXY[1];
            for(int i=0;i<4;i++) { // 인접한 4방향 탐색
                int nextX = currX + dx[i];
                int nextY = currY + dy[i];
                if(canGo(nextX,nextY)) {
                    visited[nextX][nextY] = 1; // 큐에 넣을 때 방문 표시
                    steps[nextX][nextY] = steps[currX][currY] + 1; // 거리..
                    q.add(new int[] {nextX,nextY});
                }
            }
        }

        System.out.println(steps[n-1][m-1]);
    }
}