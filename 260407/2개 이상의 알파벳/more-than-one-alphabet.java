import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.
        if(서로다른알파벳몇개(A) >= 2) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    public static int 서로다른알파벳몇개(String s) {
        char[] sArr = s.toUpperCase().toCharArray(); // 나는야 대문자가 좋아~
        int[] cnts = new int[128];
        for(char c : sArr) {
            cnts[c] = 1;
        }
        int total = 0;
        for(int n : cnts) {
            total += n;
        }

        return total;
    }
}