import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;
        for(int i=a;i<=b;i++) {
            if(isMultipleOf3(i) || is369(i)) cnt ++;
        }
        System.out.print(cnt);

    }

    public static boolean isMultipleOf3(int n) {
        if(n%3==0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean is369(int n) {
        while(n > 0) {
            int digit = n % 10;
            if(digit == 3 || digit == 6 || digit == 9) {
                return true;
            }
            n/=10;
        }
        return false;
    }
}