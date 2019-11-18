
package datatype;

import java.util.Scanner;

public class Multiplication1Semo {
   public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int m,n;
        System.out.print("Enter the intial value : ");
        m=input.nextInt();
        
        System.out.print("Enter the final value : ");
        n=input.nextInt();
        
        //used for nested for loop
        for (int i = m; i <= n; i++) {
            
            for (int j = 1; j <= 10; j++) {
            
                System.out.println(m+" x "+j+" = "+i*j);
            
        } 
            System.out.println("  ");
            
       }
        
        
      
        
        
    }
}
