import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String m = sc.next();
        System.out.print(getStartIdx(n,m));
    }

    public static boolean isSubset(String s1, String s2) {
        char[] sArr1 = s1.toCharArray();
        char[] sArr2 = s2.toCharArray();

        for(int j=0;j<sArr2.length;j++) {
            if(sArr2[j] != sArr1[j]) return false;
        }
        return true;
    }

    public static int getStartIdx(String s1, String s2) {
        for(int i=0;i<=s1.length()-s2.length();i++) {
            if(isSubset(s1.substring(i),s2)) return i;
        }
        return -1;
    }
}