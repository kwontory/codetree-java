import java.util.*;

public class Main {
    public static int[] aPosition = new int[1000*1000+1];
    public static int[] bPosition = new int[1000*1000+1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 1~1000
        int m = sc.nextInt();
        
        int currentTime = 1;
        for(int i=0;i<n;i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for(int j=0;j<t;j++) {
                aPosition[currentTime] = aPosition[currentTime-1] + v;
                currentTime++;
            }
            
        }

        int totalTime = currentTime - 1; // 총 시간 기록
        currentTime = 1; // 초기화
        for(int i=0;i<m;i++) { // m번 움직임
            int v = sc.nextInt();
            int t = sc.nextInt();
            for(int j=0;j<t;j++) {
                bPosition[currentTime] = bPosition[currentTime-1] + v;
                currentTime++;
            }
        }

        // 선두가 바뀌는 걸 어떻게 판단하지
        // 1. 처음에 같이 출발하니까 0
        // 2. 선두 변화, 현재 선두가 누구인지 저장
        int leader = 0; // 0: 공동, 1: A가 선두, 2: B가 선두
        int changes = 0;
        for(int i=1;i<=totalTime;i++) {
            if(aPosition[i] > bPosition[i]) {
                if(leader == 2) {
                    changes++;
                }
                leader = 1;
            } else if(aPosition[i] < bPosition[i]) {
                if(leader == 1) {
                    changes++;
                }
                leader = 2;
            }

            // 공동인 경우 처리하지 않음
        }

        // 출력
        System.out.print(changes);

    }

}