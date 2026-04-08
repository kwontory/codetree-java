import java.util.*;
public class Main {
    public static final int MAX_N = 100;
    public static int n;
    public static int[] nums = new int[MAX_N];
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0;i<n;i++) {
            nums[i] = sc.nextInt();
            if((i+1)%2==1) {
                Arrays.sort(nums,0,i+1);
                System.out.print(nums[i/2] + " ");
            }
        }
    }
}