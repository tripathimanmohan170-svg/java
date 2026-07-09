// Q. Count Even and Odd Elements

import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int even = 0, odd = 0;  
    System.out.println("Enter no. of elements you want to enter in the array: ");
    int n = scanner.nextInt();

    int[] arr = new int[n];
    System.out.print("Enter " + n + " elements: \n");
    for (int i = 0; i < n; i++)
    {
        arr[i] = scanner.nextInt();
        if (arr[i] % 2 == 0)
        {
            even++;
        }
        else
        {
            odd++;
        }
    }
    System.out.print ( "The array you have entered has " + even + " even numbers\n And " + odd + " odd numbers.");
        scanner.close();
    }
}
 