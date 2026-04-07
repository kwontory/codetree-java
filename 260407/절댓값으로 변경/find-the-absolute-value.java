import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++) {
            nums[i] = sc.nextInt();
        }

        abs(nums);
        
        for(int i=0;i<n;i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void abs(int[] nums) {
        for(int i=0;i<nums.length;i++) {
            if(nums[i] < 0) {
                nums[i] = nums[i] *= -1;
            }
        }
    }
}