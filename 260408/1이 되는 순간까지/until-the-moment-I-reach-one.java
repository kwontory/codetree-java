import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(f(n));
    }

    public static int f(int n) {
        if(n==1) return 0;
        if(n%2 == 0) {
            return 1 + f(n/2);
        } else {
            return 1 + f(n/3);
        }
    }

}