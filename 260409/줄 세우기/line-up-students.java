import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] data = new Student[n];
        for(int i=0;i<n;i++) {
            data[i] = new Student(i+1,sc.nextInt(),sc.nextInt());
        }
        Arrays.sort(data);
        for(int i=0;i<n;i++) {
            System.out.printf("%d %d %d\n", data[i].h, data[i].w, data[i].n);
        }
    }
}

class Student implements Comparable<Student> {
    int n, h, w;

    public Student(int n, int h, int w) {
        this.n = n;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Student s) {
        if(this.h == s.h && this.w == s.w)
            return this.n - s.n; // 번호 오름차순
        if(this.h == s.h)
            return s.w - this.w; // 몸무게 내림차순
        return s.h - this.h; // 키 내림차순
    }
}