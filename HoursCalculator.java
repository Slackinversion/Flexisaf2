// HoursCalculator.java
public class HoursCalculator implements TimeCalculator {

    @Override
    public int calculateRemainingHours(int currentHour) {
        if (currentHour < 0 || currentHour > 23) {
            System.out.println("Invalid hour! Please enter a value between 0 and 23.");
            return -1;
        }
        return 24 - currentHour;
    }

    @Override
    public void displayRemainingHours(int currentHour) {
        int remainingHours = calculateRemainingHours(currentHour);
        if (remainingHours != -1) {
            System.out.println("There are " + remainingHours + " hours left in the day.");
        }
    }
}
