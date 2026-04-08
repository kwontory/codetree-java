import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char[] cArr = sc.next().toCharArray();
        Arrays.sort(cArr);
        System.out.print(String.valueOf(cArr));
    }
}