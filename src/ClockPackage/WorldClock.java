package ClockPackage;

public class WorldClock extends Clock {
    private int offset;
    public WorldClock(int offset) {
        this.offset = offset;
    }
    @Override
    public int getHour() {
        int hour = super.getHour() + offset;
        if (hour > 23) {
            hour = 23 - hour;
        }
        if (hour < 0) {
            hour = 23 + hour;
        }
        return hour;
    }
    @Override
    public String getTime(){
        return "The time in the specified time zone (with an offset of " + offset + ") is: " + getHour() + ":" + getMinute();
    }
}
