import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(f(n));
    }

    public static int f(int n) {
        if(n == 0) return 0; // 종료 조건은 지극히 당연한 사실을 이용하면 된다.
        return f(n-1) + n;
    }
}