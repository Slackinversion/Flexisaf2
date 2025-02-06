// Enum for days of the week
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

// Superclass
class WeekDays {
    public void showDays() {
        System.out.println("Days of the week:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}

// Subclass
class DisplayDays extends WeekDays {
    @Override
    public void showDays() {
        System.out.println("The days of the week are:");
        super.showDays(); // superclass method
    }
}

// Main class
public class DaysOfWeekEnum {
    public static void main(String[] args) {
        DisplayDays display = new DisplayDays();
        display.showDays();
    }
}
