
package datatype;

import java.util.Scanner;


public class Prime1Demo {
 public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int m,n;
        System.out.print("Enter the initial value= ");
        m=input.nextInt();
        
        System.out.print("Enter the final value= ");
        n=input.nextInt();
        
        int count=0;
        
        for (int i = m; i <= n; i++) {
            
             for (int j = 2; j <= i-1; j++) {
            if (i%2==0) {
                count++;
                //System.out.println("count no: "+count);
                break;
             }
        }
             if (count==0) {
                 System.out.println(i);
                 count=0;
                
            }
        
            
         
     }
        
       
        
    }
}
