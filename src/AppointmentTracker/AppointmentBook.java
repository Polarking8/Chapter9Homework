package AppointmentTracker;
import java.util.ArrayList;
public class AppointmentBook {
    ArrayList<Appointment> appointments;
    public AppointmentBook() {
        appointments = new ArrayList<Appointment>();
    }
    public void addAppointment(Appointment app) {
        appointments.add(app);
    }
    public void showAll() {
        for(Appointment app : appointments){
            System.out.println(app.toString());
        }
    }
    public void show(int dayOn, int monthOn, int yearOn) {
        for(Appointment app : appointments){
            if(app.occursOn(dayOn, monthOn, yearOn)){
                System.out.println(app);
            }
        }
    }

}

