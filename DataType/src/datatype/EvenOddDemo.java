
package datatype;

import java.util.Scanner;

public class EvenOddDemo {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        int num;
        System.out.print("Enter The Positive Num: ");
        num=input.nextInt();
        
        if(num%2==0)
        {
            System.out.println("This is Even Num");
        }
        else
        {
            System.out.println("This is odd Num");
        }
        
        
        
    }
}
