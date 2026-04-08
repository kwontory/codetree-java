import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        r1(n);
        System.out.println();
        r2(n);
    }

    public static void r1(int n) { // 1부터
        if(n < 1) return;
        r1(n-1);
        System.out.print(n + " ");
    }

    public static void r2(int n) { // n부터
        if(n < 1) return;
        System.out.print(n + " ");
        r2(n-1);
    }
}