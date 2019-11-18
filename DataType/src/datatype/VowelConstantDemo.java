
package datatype;

import java.util.Scanner;


public class VowelConstantDemo {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        char ch;
        System.out.print("Enter The Single Char Num: ");
        ch=input.next().charAt(0);
        /*
        if(ch=='a')
        {
            System.out.println("This Char is Vowel");
        }
        
        else if(ch=='e')
        {
            System.out.println("This Char is Vowel");
        }
        
        else if(ch=='i')
        {
            System.out.println("This Char is Vowel");
        }
        else if(ch=='o')
        {
            System.out.println("This Char is Vowel");
        }
        else if(ch=='u')
        {
            System.out.println("This Char is Vowel");
        }
        else
        {
            System.out.println("This Char is Constant");
        }
        */
               
        
     if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.println("This Char is Vowel");
        }
         else
        {
            System.out.println("This Char is Constant");
        }
     
     
    }
}
