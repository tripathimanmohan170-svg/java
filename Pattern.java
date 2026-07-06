import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        // rectangle pattern
        int row=4;
        int col=5;
        for(int i=1;i<=row;i++){
            for(int j=1; j<=col;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // hollow rectangle
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1||i==row||j==1||j==col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}