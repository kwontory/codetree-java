import java.util.*;

class Person {
    String name;
    int height;
    int weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] data = new Person[n];        
        for(int i=0;i<n;i++) {
            data[i] = new Person(sc.next(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(data,Comparator.comparing(d -> d.height));
        for(int i=0;i<n;i++) {
            System.out.printf("%s %d %d\n", data[i].name,data[i].height,data[i].weight);
        }
    }
}