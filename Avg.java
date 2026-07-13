//avg of all elements of the array
import java.util.*;
public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.print("Enter no. of elements you want to enter in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: \n");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("Average of all elements of the array is "+(sum/n));
        sc.close();
    }
}