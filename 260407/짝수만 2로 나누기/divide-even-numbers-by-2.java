import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        divEven(arr);

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }


    }

    public static void divEven(int[] nums) {
        for(int i=0;i<nums.length;i++) {
            if(nums[i]%2==0) nums[i] = nums[i]/2;
        }
    }
}