package ClockPackage;

public class Clock {
    private int hour;
    private int minute;
    public Clock() {
         String currentTime = new java.util.Date().toString();
         hour = Integer.parseInt(currentTime.substring(11,13));
         minute = Integer.parseInt(currentTime.substring(14,16));
    }
    public String getMinute() {
        if (minute < 10) {
            return "0" + minute;
        } else {
            return "" + minute;
        }
    }
    public int getHour() {
        return hour;
    }
    public String getTime() {
        return "The time is: " + getHour() + ":" + getMinute();
    }
}

