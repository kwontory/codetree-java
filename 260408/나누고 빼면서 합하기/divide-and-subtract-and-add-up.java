import java.util.Scanner;
public class Main {
    public static int n, m;
    public static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int sum = 0;
        while(m > 0) {
            sum += arr[m-1];
            manipulate();
        }
        System.out.print(sum);
    }

    public static void manipulate() {
        if(m%2==1) {
            m -= 1;
        } else {
            m /= 2;
        }
    }
}