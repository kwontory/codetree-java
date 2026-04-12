import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // reference type 만 가능
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++) {
            String d = sc.next();
            if(d.equals("push")) {
                int m = sc.nextInt();
                q.add(m);
            } else if(d.equals("pop")) {
                System.out.println(q.poll());
            } else if(d.equals("size")) {
                System.out.println(q.size());
            } else if(d.equals("empty")) { 
                System.out.println(q.isEmpty()?1:0);
            } else if(d.equals("front")) {
                System.out.println(q.peek());
            }
        }
    }

}