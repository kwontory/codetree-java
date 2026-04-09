import java.util.*;
class Student implements Comparable<Student> {
    String name;
    int kor, eng, math;

    public Student() {
        this.name = "";
        this.kor = 0;
        this.eng = 0;
        this.math = 0;
    }

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Student s) { // 내림차순..
        if(s.kor == this.kor && s.eng == this.eng) return s.math - this.math;
        if(s.kor == this.kor) return s.eng - this.eng;
        return s.kor - this.kor;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Student[] data = new Student[n];

        for(int i=0;i<n;i++) {
            data[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(data);
        for(int i=0;i<n;i++) {
            System.out.printf("%s %d %d %d\n", data[i].name, data[i].kor, data[i].eng, data[i].math);
        }
    }
}