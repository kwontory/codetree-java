import java.util.*;

public class Main {
    public static int[] students = new int[100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int ans = -1;
        for(int i=0;i<m;i++) {
            int id = sc.nextInt();
            students[id]++;
            if(students[id] >= k) {
                ans = id;
                break;
            }
        }
        System.out.print(ans);
    }
}