package AppointmentTracker;

public class Appointment {
    protected int yearOn;
    protected int monthOn;
    protected int dayOn;
    protected String description;
    public Appointment(int yearOn, int monthOn, int dayOn, String description){
        this.yearOn = yearOn;
        this.monthOn = monthOn;
        this.dayOn = dayOn;
        this.description = description;
    }
    /**
     * @return returns the description of the appointment
     */
    public String getDescription(){
        return description;
    }
    /**
     * @param description the description of the appointment
     */
    public void setDescription(String description){
        this.description = description;
    }
    /**
     * @return returns the month that the appointment is on
     */
    public int getMonthOn(){
        return monthOn;
    }
    /**
     * @param monthOn the month that the appointment is on
     */
    public void setMonthOn(int monthOn){
        this.monthOn = monthOn;
    }
    /**
     * @return gets the day of the appointment
     */
    public int getDayOn(){
        return dayOn;
    }
    /**
     * @param dayOn sets the day that appointment occurs on
     */
    public void setDayOn(int dayOn){
        this.dayOn = dayOn;
    }
    /**
     * @return gets the year that the appointment is in
     */
    public int getYearOn(){
        return yearOn;
    }
    /**
     * @param yearOn sets the year that the appointment is in
     */
    public void setYearOn(int yearOn){
        this.yearOn = yearOn;
    }
    /**
     * Checks whether an appointment is on a certain date
     * @param dayOn the day the appointment is on
     * @param monthOn the month the appointment is on
     * @param yearOn the year that the appointment occurs on
     * @return true or false if an appointment occurs on the date
     */
    public boolean occursOn(int dayOn, int monthOn, int yearOn) {
        return getDayOn() == dayOn && getMonthOn() == monthOn && getYearOn() == yearOn;
    }
    /**
     * extends toString from Java's Object class
     * @return The string of the combination of the description plus the day, month, and year that the appointment is on
     */
    public String toString() {
        return description + " on " + dayOn + "/" + monthOn + "/" + yearOn;
    }
    /*
    Since Monthly, Daily, and OneTime extend this, the javadoc extends to it.
    They have slightly different syntax and return slightly different things, but the strings explain most of it.
    */

}