import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(f(arr,arr.length));
    }

    public static int f(int[] arr, int n) { // 배열, 원소 개수
        if(n == 1) return arr[0];
        int max = f(arr, n-1);
        return Math.max(arr[n-1],max);
    }
}