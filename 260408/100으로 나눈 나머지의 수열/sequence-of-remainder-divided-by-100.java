import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(f(n));
    }

    public static int f(int n) {
        if(n == 1) return 2;
        if(n == 2) return 4;
        return f(n - 2) * f(n - 1) % 100;
    }

}