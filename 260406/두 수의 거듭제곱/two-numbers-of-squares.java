import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(f(a,b));
    }
    public static int f(int a, int b) {
        return (int)Math.pow(a,b);
    }
}