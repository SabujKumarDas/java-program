
package datatype;

import java.util.Scanner;

public class BitwiseOperatorDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,c,d,e;
        
        System.out.print("Enter the value a: ");
        a=input.nextInt();
        
        System.out.print("Enter the value b: ");
        b=input.nextInt();
        
        c=a&b;
        System.out.println("The bitwise AND value: "+c);
        
        c=a|b;
        System.out.println("The bitwise OR value: "+c);
        
        c=a^b;
        System.out.println("The bitwise XOR value: "+c);
        
        d=a>>2;
        System.out.println("The bitwise Right Shift value: "+d);
        
        e=a<<3;
        System.out.println("The bitwise Left Shift value: "+e);
        
        
    }
}
