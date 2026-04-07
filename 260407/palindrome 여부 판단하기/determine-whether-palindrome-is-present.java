import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if(isPalindrome(a)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    public static boolean isPalindrome(String s) {
        if(s.equals(revStr(s))) return true;
        return false;
        
    }

    public static String revStr(String s) { 
        String r;
        char[] cArr = s.toCharArray();
        char[] rArr = new char[cArr.length];
        for(int i=0;i<rArr.length;i++) {
            rArr[i] += cArr[rArr.length-i-1];
        }

        return new String(rArr);
    }
}