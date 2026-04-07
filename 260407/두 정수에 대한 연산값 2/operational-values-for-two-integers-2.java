import java.util.*;

class TwoNums {
    int a;
    int b;

    TwoNums(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void play() {
        if(this.a > this.b) {
            this.a *= 2;
            this.b += 10;
        } else {
            this.b *= 2;
            this.a += 10;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        TwoNums tn = new TwoNums(a,b);
        tn.play();
        System.out.printf("%d %d",tn.a,tn.b);
    }
}