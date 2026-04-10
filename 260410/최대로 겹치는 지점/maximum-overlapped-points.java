import java.util.*;

public class Main {
    public static final int MAX_X = 100;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] lines = new int[MAX_X];
        for(int i=0;i<n;i++) {
            int x1 = sc.nextInt() - 1;
            int x2 = sc.nextInt() - 1;
            for(int j=x1;j<=x2;j++) {
                lines[j]++;
            }
        }
        int max = 0;
        for(int i=0;i<MAX_X;i++) {
            if(max < lines[i]) max = lines[i];
        }

        System.out.print(max);
    }
}