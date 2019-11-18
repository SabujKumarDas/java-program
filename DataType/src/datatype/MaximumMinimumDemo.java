
package datatype;

import java.util.Scanner;

public class MaximumMinimumDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1,num2,max,min;
        
        System.out.println("Enter First num: ");
        num1=input.nextInt();
        
        System.out.println("Enter Second num: ");
        num2=input.nextInt();
       
         
        max=(num1 > num2)?num1 :num2;
        System.out.println("the maximum number : "+max);
     
        min=(num1 < num2)?num1 :num2;
        System.out.println("the maximum number : "+min);
        
      /*
        if (num1>num2)
        {
            System.out.println("The max num : "+num1);
        }
        
        else if (num1<num2)
        {
            System.out.println("The min num : "+num2);
        }
        
        else if (num1==num2)
        {
            System.out.println("The num is equal");
        }
        else
        {
            System.out.println("Negetive num is not allowed");
        }
        */
    }
}
