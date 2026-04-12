import java.util.*;

class Student implements Comparable<Student> {
    int id;
    int h;
    int w;
    Student(int id, int h, int w) {
        this.id = id;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Student s) { 
        if(this.h == s.h) {
            return s.w - this.w; // 몸무게 내림차순
        }
        return this.h - s.h; // 키 오름차순
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Student[] students = new Student[N];
        for(int i=0;i<N;i++) {
            students[i] = new Student(i+1,sc.nextInt(),sc.nextInt());
        }
        Arrays.sort(students);
        for(int i=0;i<N;i++) {
            Student s = students[i];
            System.out.printf("%d %d %d\n", s.h,s.w,s.id);
        }
        
    }
}