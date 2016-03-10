/**
 * Created by hyc on 2016/2/29.
 */
public class ShowCurrentTime {
    public static void main(String[] args) {
        long totalMillSecond = System.currentTimeMillis();

        long currentMillSecond = totalMillSecond % 1000;
        long totalSecond = totalMillSecond / 1000;

        long totalMinute = totalSecond / 60;
        long currentSecond = totalSecond % 60;

        long totalHour = totalMinute / 60;
        long currentMinute = totalMinute % 60;

        long currentHour = totalHour % 60;

        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":"
                + currentSecond + "." + currentMillSecond + " GMT");
    }
}