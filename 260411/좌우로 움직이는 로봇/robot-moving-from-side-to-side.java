import java.util.*;
import java.io.*;

public class Main {
    public static int[] a = new int[1000001];
    public static int[] b = new int[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // (t, d)
        int curTime = 1;
        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            char d = st.nextToken().charAt(0);

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
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            char d = st.nextToken().charAt(0);

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
        
        bw.write(String.valueOf(cnt));
        bw.newLine();
        bw.flush();
        // System.out.print(cnt);

    }
}