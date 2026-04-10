import java.util.*;

public class Main {
    public static final int MAX_TIME = 1000*1000;
    public static final int[] a = new int[MAX_TIME + 1]; // 인덱스 초마다 position을 기록
    public static final int[] b = new int[MAX_TIME + 1];
    public static int position = 0; // 오프셋은 일단 필요 없어 보임
    public static int time = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // a는 n번 만큼 d(L,R) 방향으로 t초만큼 이동함..
        int m = sc.nextInt(); // b는 m번 만큼 d(L,R) 방향으로 t초만큼 이동함
        // 1초에 1m...
        // 1초마다 이동하는 위치를 배열에 기록해야함!
        // 최대 1000번 1번에 1000초 이동 가능하니까
        // 매번 1000초 동안 이동하면 1000*1000초 만큼 이동 가능함..
        // 몇 초 뒤에 A,B가 최초로 만나는지 출력
        // A, B가 움직임을 멈출 때까지 만나지 않는다면 -1을 출력
        int aTime = 0;
        for(int i=0;i<n;i++) {
            char d = sc.next().charAt(0);
            int t = sc.nextInt();
            aTime = move(d,t,a);
        }

        int bTime = 0;
        time = 0; // 시간 초기화..
        position = 0; // 위치 초기화..
        for(int i=0;i<m;i++) {
            char d = sc.next().charAt(0);
            int t = sc.nextInt();
            bTime = move(d,t,b);
        }

        int meet = -1;
        int total = Math.max(aTime, bTime);
        for(int i=aTime+1;i<=total;i++) {
            a[i] = a[aTime];
        }
        for(int i=bTime+1;i<=total;i++) {
            b[i] = b[bTime];
        }
        for(int i=1;i<=total;i++) {
            if(a[i] == b[i]) {
                meet = i;
                break; // 최초로 만난 시간
            }
        }

        System.out.print(meet);

    }
    public static int move(char d, int t, int[] data) {
        while(t-- > 0) {
            if(d=='L') { // 이동하고
                position--;
            } else {
                position++;
            }
            time++; // 시간경과
            data[time] = position; // 이동 기록
        }
        return time;
    }
}