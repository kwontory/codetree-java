import java.util.*;

public class Main {
    public static final int OFFSET = 100;    
    public static final int SIZE = 200 + 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] lines = new int[SIZE];

        for(int i=0;i<n;i++) {
            int x1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;

            for(int j=x1;j<x2;j++) {
                lines[j]++;
            }
        }

        int max = 0;
        for(int i=0;i<SIZE;i++) {
            if(max<lines[i]) max = lines[i];
        }

        System.out.print(max);
    }
}