// HoursApp.java
import java.util.Scanner;

public class HoursApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the current hour (0-23): ");
        int currentHour = scanner.nextInt();
        
        TimeCalculator calculator = new HoursCalculator();
        calculator.displayRemainingHours(currentHour);
        
        scanner.close();
    }
}
