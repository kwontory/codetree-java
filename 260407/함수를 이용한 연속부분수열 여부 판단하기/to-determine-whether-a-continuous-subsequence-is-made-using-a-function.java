import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        for(int i=0;i<n1;i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n2];
        for(int i=0;i<n2;i++) {
            b[i] = sc.nextInt();
        }

        if(isSubset(a,b)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    public static boolean isSubset(int[] a, int[] b) {
        for(int i=0;i<a.length;i++) {
            if(a[i] == b[0]) {
                if(i+b.length > a.length) return false;
                for(int j=1;j<b.length;j++) {
                    
                    if(b[j] != a[i+j]) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}