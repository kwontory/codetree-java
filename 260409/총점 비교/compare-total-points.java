import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int kor, eng, math;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Student s) { // 총점 오름차순
        return (this.kor + this.eng + this.math) - (s.kor + s.eng + s.math);
    }
}


public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] data = new Student[n];
        for(int i=0;i<n;i++) {
            data[i] = new Student(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        }
        Arrays.sort(data);
        for(int i=0;i<n;i++) {
            System.out.printf("%s %d %d %d\n",data[i].name,data[i].kor,data[i].eng,data[i].math);
        }

    }
}