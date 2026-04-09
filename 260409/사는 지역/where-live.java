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
        System.out.println("name " + people[n-1].name);
        System.out.println("addr " + people[n-1].addr);
        System.out.println("city " + people[n-1].city);

    }
}