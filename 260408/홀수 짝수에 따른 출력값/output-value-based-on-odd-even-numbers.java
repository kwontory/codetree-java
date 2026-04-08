import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(f(n));
    }

    public static int f(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        return n + f(n-2);
    }
}