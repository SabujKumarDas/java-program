
package datatype;

import java.util.Scanner;


public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num,temp,r,sum=0;
        System.out.print("Enter the num value : ");
        num=input.nextInt();
        temp=num;
        while(temp != 0)
        {
        r=temp%10;
        System.out.println("value : "+r);
        sum=sum+r;
        System.out.println(" digits : "+sum);
        temp=temp/10;
        
        }
        
        System.out.println("the total digit : "+sum);
        
    }
}
