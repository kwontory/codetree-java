import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for(int i=a;i<=b;i++) {
            if(isPrime(i) && isEvenDigitSum(i)) cnt++;
        }

        System.out.print(cnt);
    }

    public static boolean isPrime(int n) {
        for(int i=2;i<n;i++) {
            if(n%i == 0) return false; 
        }

        return true;
    }

    public static boolean isEvenDigitSum(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }
        if(sum % 2 == 0) return true;
        return false;
    }
}