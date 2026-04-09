import java.util.*;

class Person {
    String name;
    String addr;
    String city;

    public Person(String name, String addr, String city) {
        this.name = name;
        this.addr = addr;
        this.city = city;
    }

}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] people = new Person[n];
        for(int i=0;i<people.length;i++) {
            people[i] = new Person(sc.next(), sc.next(), sc.next());
        }
        int idx = 0;
        for(int i=0;i<people.length;i++) {
            if(people[i].name.compareTo(people[idx].name) > 0) idx = i;
        }

        System.out.println("name " + people[idx].name);
        System.out.println("addr " + people[idx].addr);
        System.out.println("city " + people[idx].city);

    }
}