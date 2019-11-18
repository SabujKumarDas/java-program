
package datatype;

import java.util.Scanner;


public class FibonacciDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int first,second,fibo,n;
        System.out.print("Enater the n value= ");
        n=input.nextInt();
        first=0;
        System.out.println(first);
        
        second=1;
        System.out.println(second);
        
       
        for (int i = 3; i <= n; i++) {
        fibo=first+second;
        System.out.println(fibo);
        first=second;
        second=fibo;
        
        
        }
        
        
        
        
    }
}
