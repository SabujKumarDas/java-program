
package datatype;

import java.util.Scanner;


public class Loop2Demo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /*
        int n,sum=0;
        System.out.print("Input value: ");
        n=input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            
            sum=sum+i;
            System.out.print(" "+i);
        }
        System.out.println(" ");
        System.out.println( " Total Sum: "+sum);
        
        */
      
        int n;
        double sum=0,j=1;
        System.out.print("Input value: ");
        n=input.nextInt();
        
        for (double i = 1; i <= n; i++) {
            
            sum=sum+j/i;
            
            
        }
        System.out.println(" ");
        System.out.println( " Total Sum: "+sum);
        
        
      
    }
}
