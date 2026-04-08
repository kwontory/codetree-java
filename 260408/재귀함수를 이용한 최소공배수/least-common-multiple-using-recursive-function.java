import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        System.out.print(lcm(arr));
    }

    public static int gcd(int n, int m) {
        return m == 0 ? n : gcd(m,n%m);
    }

    public static int lcm(int n, int m) {
        return n / gcd(n,m) * m;
    }

    public static int lcm(int[] arr) {
        int result = arr[0];
        for(int i=0;i<arr.length;i++) {
            result = lcm(result,arr[i]);
        }
        return result;
    }

    public static int gcd(int[] arr) {
        int result = arr[0];
        for(int i=0;i<arr.length;i++) {
            result = gcd(result,arr[i]);
        }
        return result;
    }
}