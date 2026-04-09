import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Plane[] data = new Plane[n];
        for(int i=0;i<n;i++) {
            data[i] = new Plane(i+1,sc.nextInt(),sc.nextInt());
        }

        Arrays.sort(data);
        for(int i=0;i<n;i++) {
            System.out.println(data[i].n);
        }
    }
}

class Plane implements Comparable<Plane> {
    int x,y,n;

    public Plane(int n, int x, int y) {
        this.n = n;
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Plane p) {
        if(this.x == p.x && this.y == p.y) 
            return this.n - p.n; // 번호 오름차순
        int dis1 = Math.abs(this.x) + Math.abs(this.y);
        int dis2 = Math.abs(p.x) + Math.abs(p.y);

        return dis1 - dis2; // 원점에서의 거리 오름차순

    }

}