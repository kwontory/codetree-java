import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        if(isValidDate(y,m,d)) {
            System.out.print(getSeason(m));
        } else {
            System.out.print(-1);
        }
        
    }

    public static String getSeason(int month) {
        if(month%12 < 3) {
            return "Winter";
        } else if(month%12 < 6) {
            return "Spring";
        } else if(month%12 < 9) {
            return "Summer";
        } else {
            return "Fall";
        }
    }

    public static boolean is윤년(int year) {
        if(year % 4 != 0) return false;
        if(year % 100 != 0) return true;
        if(year % 400 == 0) return true;
        return false; 
    }

    public static int getLastDayOfMonth(int year, int month) {
        if(!is윤년(year)) {
            if(month == 2) return 28;
        } else {
            if(month == 2) return 29;
        }
        if(month < 8 && month%2 == 1) return 31;
        if(month >= 8 && month%2 == 0) return 31;
        return 30;
    }

    public static boolean isValidDate(int year, int month, int day) {
        if(month < 1 || month > 12) return false;
        if(getLastDayOfMonth(year,month) < day) return false;
        return true;
    }
}