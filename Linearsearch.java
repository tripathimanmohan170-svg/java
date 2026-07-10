//linear search
import java.util.*;
public class Linearsearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Search an Element
// Check whether a given element exists in the array or not.
    
    
    System.out.print("Enter the no. of elements you want to enter: ");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.print("Enter the elements:\n");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.print("\033[H\033[2J"); System.out.flush();
    System.out.print("\nDo you remember the elements you entered?\n");
    System.out.print("Enter a random no. you have entered: ");
    int target=sc.nextInt();
    for(int i=0;i<n;i++){
        if(arr[i]==target){
        System.out.print("\nYou do remember!\nYour element was found at "+(i+1)+" place.");
        System.exit(0);
        }
    }
        System.out.print("\n You do not remember!");
    sc.close();
    }
}