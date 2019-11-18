
package datatype;

import java.util.Scanner;

public class SquareDemo {
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
        
        int A,S;
        System.out.print("S is :");
        S=input.nextInt();
        A= S*S;
        System.out.println("Square,A = "+A);
        
    }
}
