import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[2*n];
        for(int i=0;i<2*n;i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        int max = 0;
        for(int i=0;i<nums.length;i++) {
            if(max < nums[i] + nums[nums.length-i-1])
                max = nums[i] + nums[nums.length-i-1];
        }
        System.out.print(max);

    }
}