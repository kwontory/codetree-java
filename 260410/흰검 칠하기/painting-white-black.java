import java.util.*;

public class Main {
    public static final int OFFSET = 1000*100;
    public static final int ASCII_CODE = 128;
    public static final int LINE_SIZE = OFFSET * 2 + 1;
    public static String[] colors = new String[LINE_SIZE]; // 현재 타일의 색상
    public static int[] blacks = new int[LINE_SIZE]; // 검은색 변경 횟수
    public static int[] whites = new int[LINE_SIZE]; // 흰색 변경 횟수
    public static int pos = OFFSET; // 현재 위치

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            int x = sc.nextInt(); // 이동거리
            char dir = sc.next().charAt(0); // 방향
            move(x, dir);
        }

        int[] cnt = new int[3];
        for(int i=0;i<LINE_SIZE;i++) {
            if("white".equals(colors[i])) {
                cnt[0]++;
            } else if("black".equals(colors[i])) {
                cnt[1]++;
            } else if("gray".equals(colors[i])) {
                cnt[2]++;
            }
        }

        for(int i=0;i<3;i++) {
            System.out.print(cnt[i] + " ");
        }

    }

    public static void move(int x, char dir) {
        if(dir == 'L') { // 왼쪽으로
            for(int i=0;i<x;i++) { // x번 이동
                paint(pos,"white");
                if(i < x - 1) { // 마지막 칸에서 멈춰야함
                    pos--;
                }
            }
        } else { // 오른쪽으로
            for(int i=0;i<x;i++) { // x번 이동
                paint(pos,"black");
                if(i < x - 1) { // 마지막 칸에서 멈춰야함
                    pos++;
                }
            }
        }
    }

    public static void paint(int position, String color) { // 해당 위치만 색칠함
        if("gray".equals(colors[pos])) return;

        if(color.equals("white")) {
            whites[pos]++;
        } else {
            blacks[pos]++;
        }
        if(whites[pos] >= 2 && blacks[pos] >= 2) {
            colors[pos] = "gray";
        } else {
            colors[pos] = color;
        }
    }
}