import java.util.*;

public class Main {
    public static int[] a = new int[1000001];
    public static int[] b = new int[1000001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // (t, d)
        int curTime = 1;
        for(int i=0;i<n;i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            for(int j=0;j<t;j++) {
                if(d == 'L') {
                    a[curTime] = a[curTime-1] - 1;
                } else {
                    a[curTime] = a[curTime-1] + 1;
                }
                curTime++;
            }
        }

        int aTotalTime = curTime - 1;

        
        curTime = 1;
        for(int i=0;i<m;i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            for(int j=0;j<t;j++) {
                if(d == 'L') {
                    b[curTime] = b[curTime-1] - 1;
                } else {
                    b[curTime] = b[curTime-1] + 1;
                }
                curTime++;
            }
        }

        int bTotalTime = curTime -1;
        int maxTime = Math.max(aTotalTime,bTotalTime);
        for(int i=aTotalTime+1;i<=maxTime;i++) {
            a[i] = a[aTotalTime];
        }
        for(int i=bTotalTime+1;i<=maxTime;i++) {
            b[i] = b[bTotalTime];
        }

        int cnt = 0;
        for(int i=1;i<=maxTime;i++) {
            if(a[i-1] != b[i-1] && a[i] == b[i]) {
                cnt++;
            }
        }
        
        System.out.print(cnt);

    }
}