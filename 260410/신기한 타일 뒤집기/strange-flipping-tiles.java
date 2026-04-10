import java.util.*;

public class Main {
    public static final int OFFSET = 1000*100;
    public static final int SIZE = OFFSET*2+1;
    public static int position = OFFSET;
    public static int[] tileColor = new int[SIZE];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);
            move(x,d);
        }
        int w = 0;
        int b = 0;
        for(int i=0;i<SIZE;i++) {
            if(tileColor[i] == 1) {
                w++;
            } else if (tileColor[i] == 2) {
                b++;
            }
        }

        System.out.print(w + " " + b);
    }

    public static void move(int x, char d) {
        int color = getColor(d);
        while(x-- > 0) {
            flip(color); // 타일 뒤집기
            
            // 위치 조정
            if(d == 'L') {
                if(x > 0) position--; // 마지막으로 뒤집은 타일 위치에 서 있는다.
            } else {
                if(x > 0) position++;
            }

        }
    }

    public static void flip(int color) {
        tileColor[position] = color;
    }

    public static int getColor(char d) { // 0 회색
        if(d =='L') { // L 흰색
            return 1;
        } else { // R 검은색
            return 2; 
        }
    }
}