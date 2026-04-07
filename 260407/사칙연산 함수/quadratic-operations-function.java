import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        // Please write your code here.
        if(o == '+') {
            System.out.printf("%d %c %d = %d", a, o, c, add(a,c));
        } else if(o == '-') {
            System.out.printf("%d %c %d = %d", a, o, c, sub(a,c));
        } else if(o == '*') {
            System.out.printf("%d %c %d = %d", a, o, c, mul(a,c));
        } else if(o == '/') {
            System.out.printf("%d %c %d = %d", a, o, c, div(a,c));
        } else {
            System.out.print("False");
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }
    
    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }
}