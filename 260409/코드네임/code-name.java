import java.util.*;
class Spy {
    String name;
    int score;

    public Spy() {

    }

    public Spy(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        Spy[] spies = new Spy[5];

        for(int i=0;i<spies.length;i++) {
            spies[i] = new Spy(sc.next(), sc.nextInt());
        }
        Arrays.sort(spies, Comparator.comparing(s -> s.score));

        System.out.print(spies[0].name + " " + spies[0].score);
    }
}