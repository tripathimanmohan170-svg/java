import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        // 1. Create the Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- SECURE SYSTEM LOGIN ---");
        System.out.print("Enter your role (Admin, Agent, Civilian): ");
        
        // Take the input and store it in a String variable called 'role'
        String role = scanner.nextLine();

        // 2. The Conditional Statements begin here!
        // Notice we use .equalsIgnoreCase() instead of ==
        
        if (role.equalsIgnoreCase("Admin")) {
            System.out.println("Access Granted. Welcome, Administrator.");
            System.out.println("System status: All servers online.");
            
        } else if (role.equalsIgnoreCase("Agent")) {
            System.out.println("Access Granted. Welcome, Field Agent.");
            System.out.println("Mission briefing: Retrieve the package at midnight.");
            
        } else if (role.equalsIgnoreCase("Civilian")) {
            System.out.println("Access Denied. This terminal is classified.");
            
        } else {
            // 3. The Catch-All
            // If the user types anything other than the 3 roles above, this runs.
            System.out.println("SECURITY ALERT! Unrecognized role: " + role);
            System.out.println("Locking terminal...");
        }

        // Always close your scanner when you're done!
        scanner.close();
    }
}