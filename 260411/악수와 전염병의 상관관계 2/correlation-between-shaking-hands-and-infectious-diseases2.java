import java.util.*;
class Shakes implements Comparable<Shakes> {
    int t, n, m;
    public Shakes(int t, int n, int m) {
        this.t = t;
        this.n = n;
        this.m = m;
    }

    @Override
    public int compareTo(Shakes s) {
        return this.t - s.t; // t 오름차순
    }
}

public class Main {
    public static int K;
    public static int[] status; // 감염여부
    public static int[] counts; // 감염횟수 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 총 N명의 개발자
        K = sc.nextInt(); // 전염 가능 횟수
        int P = sc.nextInt(); // 전염병에 걸린 개발자 번호
        int T = sc.nextInt(); // T번에 걸쳐서 악수
        Shakes[] shakes = new Shakes[T];
        status = new int[N+1]; // 감염여부
        counts = new int[N+1]; // 감염횟수
        status[P] = 1; // 최초 감염자

        for (int i = 0; i < T; i++) { // T번 악수가 이루어짐
            shakes[i] = new Shakes(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        // 시간 순으로 정렬
        Arrays.sort(shakes);
        for(Shakes s : shakes) {
            shake(s);
        }

        for(int i=1;i<=N;i++) {
            System.out.print(status[i]);
        }
    }

    public static void shake(Shakes s) { 
        int n = s.n;
        int m = s.m;
        boolean ninfected = status[n] == 1;
        boolean minfected = status[n] == 1;

        if(ninfected && counts[n] < K) {
            status[m] = 1;
            counts[n]++;
            // return 하면 안됨.. 둘다 감염된 경우도 옮기는 횟수에 포함
        }

        if(minfected && counts[m] < K) {
            status[n] = 1;
            counts[m]++;
        }
    }
}