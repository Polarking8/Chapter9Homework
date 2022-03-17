package ClockPackage;

public class ClockTester {
    public static void main(String[] args) {
        Clock normalClock = new Clock();
        System.out.println(normalClock.getTime());
        WorldClock worldClock = new WorldClock(3);
        System.out.println(worldClock.getTime());
    }
}
