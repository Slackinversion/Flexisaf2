import java.util.Scanner;

public class StringReverser { 

    // Recursive method 
    static String reverse(String s) {
        if (s.isEmpty()) {  // Case for empty string
            return "";
        }
        return reverse(s.substring(1)) + s.charAt(0); 
        // Recursive call
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text or a number: ");
        String input = scanner.nextLine(); // Read the input as a string
        String reversed = reverse(input);
        System.out.println("Reversed Output: " + reversed);
        scanner.close(); 
                // Try and catch to show if not a number
                try {
                    int reversedNumber = Integer.parseInt(reversed);
                    System.out.println("Converted Back to Number: " + reversedNumber);
                } catch (NumberFormatException e) {
                    // If it's not a valid number, do nothing
                }
        
    }
}