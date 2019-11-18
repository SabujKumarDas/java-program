
package datatype;

import java.util.Scanner;


public class PrimeNumberDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.print("Enter the final value= ");
        num=input.nextInt();
        int count=0;
        for (int i = 2; i < num; i++) {
            if (num%2==0) {
                count++;
                System.out.println("count no: "+count);
                break;
             }
        }
        if (count==0) {
            System.out.println("This number is prime number");
        }
        else {
            System.out.println("This is not a prime number number");
        }
        
    }
}
