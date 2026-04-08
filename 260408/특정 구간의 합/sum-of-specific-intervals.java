import java.util.Scanner;
public class Main {
    public static int MAX_VALUE = 100;
    public static int[] a = new int[MAX_VALUE + 1];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            // Please write your code here.
            System.out.println(sum(a1,a2));
        }
    }
    public static int sum(int start, int end) {
        int sum = 0;
        for(int i=start;i<=end;i++) {
            sum+= a[i];
        }
        return sum;
    }
}