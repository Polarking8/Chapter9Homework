package AppointmentTracker;

public class Daily extends Appointment{
    public Daily(int yearOn, int monthOn,int dayOn, String description) {
        super(yearOn, monthOn, dayOn, description);
    }
    public boolean occursOn(int d, int m, int y){
        return true;
    }
}


