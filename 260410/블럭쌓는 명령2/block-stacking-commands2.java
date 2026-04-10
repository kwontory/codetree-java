import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] blocks = new int[n];
        for(int i=0;i<k;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int j=a;j<=b;j++) {
                blocks[i]++;
            }
        }

        int max = blocks[0];
        for(int i=1;i<n;i++) {
            if(max < blocks[i]) max = blocks[i];
        }

        System.out.print(max);
    }
}