
package datatype;

import java.util.Scanner;


public class RectangleDemo {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int A,Length,Width;
        
        System.out.print("The rectangular Length is : ");
        Length=input.nextInt();
       
         System.out.print("The rectangular Width is : ");
         Width=input.nextInt();
        
         A= Length*Width;
         System.out.println("The Rectangle Area,A = "+A);
         
    }
}
