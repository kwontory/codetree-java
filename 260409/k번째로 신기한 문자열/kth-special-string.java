import java.util.*;

public class Main {
    public static int n, k;
    public static String t;
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        t = sc.next();
        String[] words = new String[n];
        for(int i=0;i<n;i++) {
            words[i] = sc.next();
        }
        Arrays.sort(words);

        ArrayList<String> tWords = new ArrayList<>();
        for(int i=0;i<n;i++) {
            if(isStartWithT(words[i])) tWords.add(words[i]);
        }

        if(k <= tWords.size()) System.out.print(tWords.get(k-1));
    }

    public static boolean isStartWithT(String s) {
        char[] tChars = t.toCharArray();
        char[] sChars = s.toCharArray();
        if(tChars.length > sChars.length) return false;
        for(int i=0;i<tChars.length;i++) {
            if(tChars[i] != sChars[i]) return false;
        }
        return true;
    }
}