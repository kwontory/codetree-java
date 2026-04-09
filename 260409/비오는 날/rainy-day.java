import java.util.*;

class Weather {
    String date;
    String dayOfWeek;
    String weather;

    public Weather(String date, String dayOfWeek, String weather) {
        this.date = date;
        this.dayOfWeek = dayOfWeek;
        this.weather = weather;
    }

}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Weather[] data = new Weather[n];
        for(int i=0;i<n;i++) {
            data[i] = new Weather(sc.next(),sc.next(),sc.next());
        }

        for(int i=0;i<n;i++) {
            if(data[i].weather.equals("Rain")) {
                System.out.printf("%s %s %s", data[i].date, data[i].dayOfWeek, data[i].weather);
                break;
            }
        }
    }
}