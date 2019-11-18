
package datatype;

import java.util.Scanner;

public class AssinsementDemo {
    public static void main(String[] args) {
       /* 
        int x=10, y=5;
         x+=y; //x=10+5=15
         System.out.println("x = "+x);
         
         x-=y;//x=15-5=10
           System.out.println("x = "+x);
           
         x*=y;//x=10*5=50
          System.out.println("x = "+x);
          
         x/=y;//x=50/5=10
          System.out.println("x = "+x);
          
         x%=y;//x=10/5=0
         System.out.println("x = "+x);
         
               */
        
        Scanner input=new Scanner(System.in);
        int x,y;
        System.out.print("x value is: ");
        x=input.nextInt();
        
        System.out.print("y value is: ");
        y=input.nextInt();
       
         x+=y; //x=10+5=15
         System.out.println("x = "+x);
         
         x-=y;//x=15-5=10
           System.out.println("x = "+x);
           
         x*=y;//x=10*5=50
          System.out.println("x = "+x);
          
         x/=y;//x=50/5=10
          System.out.println("x = "+x);
          
         x%=y;//x=10/5=0
         System.out.println("x = "+x);
         
    }
}
