import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int base = sc.nextInt();
        int size = (int)(Math.log(N)/Math.log(base)) + 1;
        int[] digits = new int[size];

        int idx = 0;
        while(true) {
            if(N < base) {
                digits[idx] = N;
                break;
            }
            digits[idx] = N%base;
            N /= base;
            idx++;
        }

        for(int i=digits.length-1;i>=0;i--) {
            System.out.print(digits[i]);
        }
    }
}