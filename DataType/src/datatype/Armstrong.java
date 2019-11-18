
package datatype;

import java.util.Scanner;


public class Armstrong {
    
  public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int r,num,temp,sum=0;
        System.out.print("Enter the value : ");
        num=input.nextInt();
        temp=num;
        while(temp !=0)
        {   
            r=temp%10;
            sum=sum+r*r*r;
            
            temp=temp/10;
           
        
        }
         System.out.println("the revers value : "+sum);
         if (num==sum)
        {
            System.out.println("This is armstrong");
        }
         else
         {
             System.out.println("This is not a armstrong");
         }
    }
}
