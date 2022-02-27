package AppointmentTracker;

import java.util.Scanner;

public class AppointmentTester{
    public static void main(String[] args) {
        AppointmentBook schedule = new AppointmentBook();
        schedule.addAppointment(new Monthly(2022,5,1,"fill in CAS for IB"));
        schedule.addAppointment(new Daily(2022,3,1,"check Trello"));
        schedule.addAppointment(new OneTime(2022, 3, 3, "Renew Learner's permit"));
        System.out.println("The appointments you have are:");
        schedule.showAll();
        Scanner scanner = new Scanner(System.in);
        String answer, description;
        int num, dayOn, monthOn, yearOn;
        Appointment app;
        while(true) {
            System.out.println("Add an appointment? y for yes and n for no:");
            answer = scanner.next();
            if(!answer.equalsIgnoreCase("y")){
                break;
            }else{
                while(true) {
                    System.out.println("Choose the type of appointment to add: ");
                    System.out.println("1. Onetime appointment");
                    System.out.println("2. Daily");
                    System.out.println("3. Monthly");
                    System.out.println("Enter a number other than 1-3 to exit");
                    num = scanner.nextInt();
                    if(num<1 || num>3){
                        break;
                    }
                    scanner.nextLine();
                    System.out.println("Enter a description: ");
                    description = scanner.nextLine();
                    System.out.println("Enter a day: ");
                    dayOn = scanner.nextInt();
                    System.out.println("Enter the month: ");
                    monthOn = scanner.nextInt();
                    System.out.println("Enter the year: " );
                    yearOn = scanner.nextInt();
                    if(num == 1) {
                        app = new OneTime(yearOn, monthOn, dayOn, description);
                    }else if(num == 2) {
                        app = new Daily(yearOn, monthOn, dayOn, description);
                    }else{
                        app = new Monthly(yearOn, monthOn, dayOn, description);
                    }
                    schedule.addAppointment(app);
                }
            }
        }
        System.out.println("The current appointments in the book are:");
        schedule.showAll();
        System.out.println("Enter date to show the appointments set for that date:");
        System.out.println("Enter the day:");
        dayOn = scanner.nextInt();
        System.out.println("Enter Month:");
        monthOn = scanner.nextInt();
        System.out.println("Enter Year: ");
        yearOn = scanner.nextInt();
        schedule.show(dayOn,monthOn,yearOn);
    }
}


