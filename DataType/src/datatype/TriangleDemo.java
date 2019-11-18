
package datatype;

import java.util.Scanner;


public class TriangleDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int Base,Height;
        double Area;

        System.out.print("Base is = ");
        Base=input.nextInt();
        
        System.out.print("Height is = ");
        Height=input.nextInt();
        
        Area=0.5*Base*Height;
        System.out.println("The Triangle Area is : "+Area);
        
        
    }
}
