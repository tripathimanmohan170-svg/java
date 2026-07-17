import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-5) to learn hello in different languages: ");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("You selected option 1.(Hello in HIndi!) : "+"Namaste");
                break;
            case 2:
                System.out.println("You selected option 2.(Hello in Spanish!) : "+"Hola");
                break;
            case 3:
                System.out.println("You selected option 3.(Hello in French!) : "+"Bonjour");
                break;
            case 4:
                System.out.println("You selected option 4.(Hello in Japanese!) : "+"Konichiwa");
                break;
                case 5:
                System.out.println("You selected option 5.(Hello in German!) : "+"Guten Tag");
                break;
            default:
                System.out.println("Invalid option. Please select a number between 1 and 5.");
        }

        scanner.close();
    }
}       
