import java.util.Scanner;

public class Password{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Enter your name :");
        String name = scanner.nextLine();   

        System.out.println("Enter your birth year (eg. : 2000)");
        int year = scanner.nextInt(); 

        System.out.println("Hello " + name + ", you are " + (2026 - year) + " years old."+"Sample password is : " + name+year);

        scanner.close();
            }
}
