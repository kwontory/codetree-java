import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt(); // b 진수로 변환
        String n = sc.next(); // a 진수로 표현된 어떤 수 n

        System.out.print(fromDecimal(b,toDecimal(a,n)));
    }

    public static int toDecimal(int base, String n) {
        int decimal = 0;

        for(int i=0;i<n.length();i++) {
            int digit = n.charAt(i) - '0'; 
            decimal = decimal * base + digit;
        }

        return decimal;
    }

    public static String fromDecimal(int base, int n) {
        int size = (int) (Math.log(n)/Math.log(base)) + 1;
        int[] digits = new int[size];
        int idx = 0;
        while(n > 0) {
            digits[idx] = n%base;
            n /= base;
            idx++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=idx-1;i>=0;i--) {
            sb.append(digits[i]);
        }
        return sb.toString();
    }
}