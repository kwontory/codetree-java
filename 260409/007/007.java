import java.util.*;

class Spy {
    static String secret;
    static char place;
    static int time;
    
    public Spy (String secret, char place, int time) {
        this.secret = secret;
        this.place = place;
        this.time = time;
    }

    public static void print() {
        System.out.println("secret code : " + secret);
        System.out.println("meeting point : " + place);
        System.out.println("time : " + time);
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        Spy spy = new Spy(sc.next(),sc.next().charAt(0),sc.nextInt());
        spy.print();
    }
}