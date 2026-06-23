import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = sc.next(); // Read user input for name but not after space

        sc.nextLine(); // Consume the newline character left by next()

        System.out.println("Your name is : " + name);    

        System.out.print("Enter you full name : ");
        String fullname = sc.nextLine(); // Read user input for full name including spaces
        System.out.println("Your full name is : " + fullname);

        sc.close();
    }
}