import java.util.*;

class Bomb {
    String code;
    char color;
    int sec;

    public Bomb(String code, char color, int sec) {
        this.code = code;
        this.color = color;
        this.sec = sec;
        print();
    }

    void print() {
        System.out.println("code : " + this.code);
        System.out.println("color : " + this.color);
        System.out.println("second : " + this.sec);
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        Bomb b = new Bomb(sc.next(), sc.next().charAt(0), sc.nextInt());
    }
}