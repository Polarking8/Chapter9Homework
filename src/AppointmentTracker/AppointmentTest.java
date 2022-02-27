package AppointmentTracker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class AppointmentTest {
    @Test
    public void dailyTrelloTest(){
        AppointmentBook book = new AppointmentBook();
        Daily app = new Daily(2022,2,2,"Check Trello");
        Assertions.assertEquals("Check Trello on 2/2/2022",app.toString());
    }
    @Test
    public void monthlyCASTest(){
        AppointmentBook book = new AppointmentBook();
        Monthly app = new Monthly(2022,6,4,"Fill Out CAS");
        Assertions.assertEquals("Monthly appointment Fill Out CAS on day 4 of the month",app.toString());
    }
    @Test
    public void OneTimePermitTest(){
        AppointmentBook book = new AppointmentBook();
        OneTime app = new OneTime(2022,3,3,"Renew Permit");
        Assertions.assertEquals("One time appointment of Renew Permit on 3/3/2022",app.toString());
    }
}