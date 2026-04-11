import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char[] directions = sc.next().toCharArray();
        int[] dx = {0,1,0,-1}; // 북
        int[] dy = {1,0,-1,0};
        int x = 0;
        int y = 0;
        int d = 0; // 북에서 시작
        for(int i=0;i<directions.length;i++) {
            if(directions[i] == 'F') {
                x = x + dx[d];
                y = y + dy[d];
            } else if(directions[i] == 'L') {
                d = (d - 1 + 4) % 4;
            } else {
                d = (d + 1) % 4;
            }
            if(directions[i] == 'F' && x == 0 && y == 0) {
                System.out.print(i+1); // 시간 출력
                return;
            }
        }
        System.out.print("-1");
        
    }


}