import java.util.*;
public class Sorted {
    public static void main(String[] args){

//  Q1. Check if Array is Sorted
// Determine whether the array is sorted in ascending order.
// Solution 1:
    int[] arr = new int[50];
    System.out.println("This program will check if the array is sorted in ascending order.");
    System.out.print("Enter the number of elements in the array: ");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++)
    {
        arr[i] = scanner.nextInt();
    }
    boolean isSorted = true;
    for (int i = 0; i < n - 1; i++)
    {
        if (arr[i] > arr[i + 1])
        {
            isSorted = false;
            break;
        }
    }
    if (isSorted)
    {
        System.out.println("The array is sorted in ascending order.");
    }
    else
    {
        System.out.println("The array is not sorted in ascending order.");
    }
// Q2. Find Frequency of an Element
// Take an array and a number `x`.
// Print how many times `x` appears in the array.
    int x;
    System.out.print("Enter the number whose frequency you want to find: ");
    x = scanner.nextInt();
    int count = 0;
    for (int i = 0; i < n; i++)
    {
        if (arr[i] == x)
        {
            count++;
        }
    }
    System.out.println("The frequency of " + x + " in the array is: " + count);
    scanner.close();
    }    
}
