package AppointmentTracker;

public class OneTime extends Appointment{
    public OneTime(int yearOn, int monthOn, int dayOn, String description) {
        super(yearOn, monthOn, dayOn, description);
    }
    public String toString(){
        return "One time appointment of " + super.toString();
    }
}
