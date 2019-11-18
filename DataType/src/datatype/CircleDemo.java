
package datatype;

import java.util.Scanner;

public class CircleDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        double Area,Radius;
        System.out.print("Enter Radius is: ");
        Radius=input.nextDouble();
        
        Area=3.1416*Radius*Radius;
        
        System.out.println("The Circle Area is: "+Area);
      
    }
}
