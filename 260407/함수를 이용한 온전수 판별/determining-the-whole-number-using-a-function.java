import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for(int i=a;i<=b;i++) {
            if(is온전수(i)) cnt++;
        }

        System.out.print(cnt);
    }

    public static boolean is온전수(int n) {
        return(n%2!=0 && n%10!=5 && !(n%3==0 && n%9!=0));
    }
}