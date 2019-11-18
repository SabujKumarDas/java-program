
package datatype;

import java.util.Scanner;


public class FarenheightToCalciusDemo {
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
        Double Calsius,Farenheight;
        
        System.out.print("Enter Farenheight value is: ");
        Farenheight=input.nextDouble();
        
        Calsius=(((Farenheight-32)/9)*5);
        System.out.println("The Calsius Value is: "+Calsius);
        
    }
}
