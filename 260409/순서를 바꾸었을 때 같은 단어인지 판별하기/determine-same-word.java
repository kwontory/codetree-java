import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();

        if(f(a,b)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }

    }
    public static boolean f(char[] a, char[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        if(a.length != b.length) return false;
        for(int i=0;i<a.length;i++) {
            if(a[i] != b[i]) return false;
        }

        return true;
    }
}