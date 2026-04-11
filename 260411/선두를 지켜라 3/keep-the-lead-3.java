import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[1000*1000+1];
        int[] b = new int[1000*1000+1];
        // A
        int atime = 1;
        for(int i=0;i<n;i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for(int j=1;j<=t;j++) {
                a[atime] = a[atime-1] + v;
                atime++; 
            }
        }

        // B
        int btime = 1;
        for(int i=0;i<m;i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for(int j=1;j<=t;j++) {
                b[btime] = b[btime-1] + v;
                btime++;
            }            
        }

        // 총 이동시간은 동일하게 주어지므로 조정할 필요 X
        int totalTime = atime - 1;

        int cnt = 0;
        int leader = 0;
        for(int i=1;i<=totalTime;i++) { // 여기도 인덱스가 헷갈림
            int currentLeader;
            if(a[i] > b[i]) currentLeader = 1;
            else if(b[i] > a[i]) currentLeader = 2;
            else currentLeader = 0;
            // 0시간에서 -> 1시간으로 바뀔 때도 바뀐 것으로 처리함
            if(currentLeader != leader) {
                cnt++;
            }

            leader = currentLeader; // 현재 리더로 기록
        }

        System.out.print(cnt);

    }

}