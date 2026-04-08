import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            b[i] = sc.nextInt();
        }
        f(a,b);

    }
    public static void f(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++) {
            if(a[i] != b[i]) {
                System.out.print("No");
                return;
            }
        }
        System.out.print("Yes");
    }
}