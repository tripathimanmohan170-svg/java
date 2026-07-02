import java.util.*;
public class Loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // Sum of first n natural numbers
        System.out.println("Enter an integer");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);

        // Table of a number
        System.out.println("Enter a number to print its table");
        int num=sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(num+"X"+i+"="+(num*i));
        }
    }
}