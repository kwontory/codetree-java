import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int h;
    int w;

    Student(String n, int h, int w) {
        this.name = n;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Student s) {
        if(s.h == this.h) {
            return s.w - this.w;
        }
        return this.h - s.h;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] students = new Student[n];
        for(int i=0;i<n;i++) {
            students[i] = new Student(sc.next(),sc.nextInt(),sc.nextInt());
        }

        Arrays.sort(students);
        for(int i=0;i<n;i++) {
            Student s = students[i];
            System.out.printf("%s %d %d\n", s.name, s.h, s.w);
        }
    }
}