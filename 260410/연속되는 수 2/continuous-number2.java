import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 1; // 첫 숫자는 이미 1개
        int max = 1;
        for(int i=1;i<n;i++) { // 첫 숫자 제외하고 시작
            if(arr[i] == arr[i-1]) { // 이전 숫자와 같으면 카운트 증가
                cnt++;
            } else {
                cnt = 1; // 다르면 1로 초기화
            }
            if(cnt > max) { // 반복마다 최댓값을 갱신
                max = cnt;
            }
        }
        System.out.print(max);
    }
}