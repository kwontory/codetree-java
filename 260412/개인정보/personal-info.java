import java.util.*;

class Student {
    String name;
    int h;
    double w;

    public Student(String name, int h, double w) {
        this.name = name;
        this.h = h;
        this.w = w;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];
        for(int i=0;i<5;i++) {
            students[i] = new Student(sc.next(), sc.nextInt(), sc.nextDouble());
        }

        Arrays.sort(students,Comparator.comparing(s -> s.name));
        System.out.println("name");
        for(int i=0;i<5;i++) {
            Student s = students[i];
            System.out.printf("%s %d %.1f\n", s.name, s.h, s.w);
        }
        System.out.println();

        Arrays.sort(students,Comparator.comparing(s -> s.h, Comparator.reverseOrder()));
        System.out.println("height");
        for(int i=0;i<5;i++) {
            Student s = students[i];
            System.out.printf("%s %d %.1f\n", s.name, s.h, s.w);
        }
    }
}