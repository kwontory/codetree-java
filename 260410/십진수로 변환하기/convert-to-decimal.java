import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        int result = 0;
        for(int i=0;i<binary.length();i++) {
            int bit = binary.charAt(i) - '0';
            result = result * 2 + bit; 
        }

        System.out.print(result);
    }
}