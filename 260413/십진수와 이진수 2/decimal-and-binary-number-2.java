import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] binary = sc.next().toCharArray();
        int base = 2;
        int result = 0;
        for(char b : binary) {
            int bn = b - '0';
            result = result * base + bn;
        }
        result *= 17;

        // 다시 이진수로
        int[] digits = new int[(int)(Math.log(result)/Math.log(base)) + 1];
        int idx = 0;
        while(result > 0) {
            if(result < base) {
                digits[idx] = result;
                break;
            }
            digits[idx] = result%base;
            result /= base;
            idx++;
        }

        for(int i=digits.length-1;i>=0;i--) {
            System.out.print(digits[i]);
        }
    }
}