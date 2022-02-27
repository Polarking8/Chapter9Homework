package AppointmentTracker;

public class Monthly extends Appointment{
    public Monthly(int yearOn, int monthOn, int dayOn, String description) {
        super(yearOn, monthOn, dayOn, description);
    }
    public boolean occursOn(int yearOn, int monthOn, int dayOn) {
        if(getDayOn() == dayOn) {
            return true;
        }else{
            return false;
        }
    }
    public String toString() {
        return "Monthly appointment " + description + " on day " + dayOn + " of the month";
    }

}
