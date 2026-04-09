import java.util.*;

class Character {
    String user;
    int lv;

    public Character() {
        this.user = "codetree";
        this.lv = 10;

        print();
        
    }

    public Character(String user, int lv) {
        this.user = user;
        this.lv = lv;

        print();
    }

    void print() {
        System.out.println("user " + this.user + " lv " + this.lv);
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        Character c1 = new Character();
        Character c2 = new Character(sc.next(),sc.nextInt());

    }
}