import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        // int[] -> Integer[]
        Integer[] arr2 = Arrays.stream(arr)
                                .boxed()
                                .toArray(Integer[]::new);
        // 오름차순
        Arrays.sort(arr2);
        for(int i=0;i<n;i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        // 내림차순
        Arrays.sort(arr2,Collections.reverseOrder());
        for(int i=0;i<n;i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}