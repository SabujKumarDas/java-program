
package datatype;

import java.util.Scanner;


public class Loop1Demo {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        int m,n;
        int sum=0;
        System.out.print("Enter the initial value : ");
        m=input.nextInt();
        
        System.out.print("Enter the final value : ");
        n=input.nextInt();
        for (int i = m; i <= n; i++)
        {
            if (i%2!=0)
            {
                
            sum=sum+i;
            System.out.print(" "+i);  // '+' concreate 
            
            }
           } 
          System.out.println("  total sum : "+sum);
        
        
    }
}
