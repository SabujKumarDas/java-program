
package datatype;

import java.util.Scanner;


public class CalsiusToFarenheightDemo {
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
        Double Calsius,Farenheight;
        
        System.out.print("Enter Calsius value is: ");
        Calsius=input.nextDouble();
        
        Farenheight=(((Calsius*9)/5)+32);
        System.out.println("The Farenheight Value is: "+Farenheight);
        
    }
}
