import java.util.Scanner;

class TwoNum {
    int a;
    int b;

    TwoNum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void play() {
        if(this.a > this.b) {
            this.a += 25;
            this.b *= 2;
        } else {
            this.b += 25;
            this.a *= 2;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.

        TwoNum tn = new TwoNum(a,b);
        tn.play();

        System.out.printf("%d %d", tn.a, tn.b);
    }

}