import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(p(n));
    }
    public static int p(int n) {
        if(n == 1) return 1;
        if(n == 2) return 1;
        return p(n-2) + p(n-1);
    }
}