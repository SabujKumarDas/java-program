
package datatype;

import java.util.Scanner;


public class OperatorDemo {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int number1,number2,result;
        System.out.print("First Number Input : ");
        number1 =input.nextInt();
        
        System.out.print("Second Number Input : ");
        number2 =input.nextInt();
        //Sum
        result =number1 +number2;
        System.out.println("Sum = "+result);
       //sub
        result =number1 -number2;
        System.out.println("sub = "+result);
       //mul
        result =number1 *number2;
        System.out.println("mul = "+result);
       //div
        double result1 =(double)number1 /number2;
        System.out.println("div = "+result1);
       //modulation
        result =number1 %number2;
        System.out.println("modulation = "+result);
       
        
        
    }
    
}
