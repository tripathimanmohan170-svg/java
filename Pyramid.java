import java.util.*;
public class Pyramid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //half pyramid
        System.out.print("Enter no. of rows to print half pyramid and inverted half pyramid: ");
        int row=sc.nextInt();
        System.out.print("Half pyramid: \n");
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");               
            }
            System.out.println();
        }
        
        //inverted half
         System.out.print("Inverted half pyramid: \n");
         for(int i=1;i<=row;i++){
            for(int j=row;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
         }

    }
}