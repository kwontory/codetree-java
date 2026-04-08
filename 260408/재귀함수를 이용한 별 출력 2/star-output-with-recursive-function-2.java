import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        f(n);
    }

    public static void f(int n) {
        if(n < 1) return;
        for(int i=0;i<n;i++) {
            System.out.print("* ");
        }
        System.out.println();
        f(n-1);
        for(int i=0;i<n;i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}