import java.util.Scanner;
public class Main {
    public static final int[] daysInMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        
        String result = isValidDate(m, d)? "Yes" : "No";
        System.out.print(result);

    }

    public static boolean isValidDate(int m, int d) {
        if(m < 1 || m > 12) return false;
        if(daysInMonth[m] < d) return false;
        return true;
    }

}