import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Sequence[] arr = new Sequence[n];
        for(int i = 0; i < n; i++){
            arr[i] = new Sequence(i+1,sc.nextInt());
        }
        // Please write your code here.
        Arrays.sort(arr);

        int[] data = new int[n];
        for(int i = 0; i < n; i++){
            data[arr[i].id-1] = i + 1; 
        }

        for(int i = 0;i<n;i++) {
            System.out.print(data[i] + " ");
        }

    }
}

class Sequence implements Comparable<Sequence> {
    int n, id;

    public Sequence(int id, int n) {
        this.id = id;
        this.n = n;
    }

    @Override
    public int compareTo(Sequence s) {
        if(this.n == s.n) return this.id - s.id; // id 오름차순
        return this.n - s.n; // 수열 오름차순
    }
}