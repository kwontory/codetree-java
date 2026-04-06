import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(f(n)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
        // Please write your code here.
    }
    public static boolean f(int n) {
        if(n%2==0 && ((n/10)+(n%10))%5==0) {
            return true;
        } else {
            return false;
        }
    }
}