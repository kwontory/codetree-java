import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int base = 2;
        int size = (int) (Math.log(100000)/Math.log(base)) + 1;
        int[] digits = new int[size];
        int cnt = 0;
        while(true) {
            if(n < 2) {
                digits[cnt] = n;
                break;
            }
            digits[cnt] = n % 2;
            n /= 2;
            cnt++;
        }

        for(int i = cnt;i>=0;i--) {
            System.out.print(digits[i]);
        }
    }
}