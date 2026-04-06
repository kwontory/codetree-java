import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.print(getLcm(n,m));
    }

    public static int getGcd(int n, int m) {
        while(m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        return Math.abs(n);
    }

    public static int getLcm(int n, int m) {
        return Math.abs(n/getGcd(n,m)*m);
    }
}