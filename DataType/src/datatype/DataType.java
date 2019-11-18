
package datatype;

import java.util.Scanner;


public class DataType {

  
    public static void main(String[] args) {
        boolean b=true;
        char c='b';
        int i=12;
        short s=10;
        float f=34.3f;
        double d=23.23;
        
    
    System.out.println("boolean = " + b);
    System.out.println("Char = "+c);
    System.out.println("int = "+i);
    System.out.println("short = "+s);
    System.out.println("float = "+f);
    System.out.println("double = "+d);
                
   //user input 
    Scanner input= new Scanner(System.in);
    
    /*
    int number;
    
    
        System.out.print("Enter your Number : ");
       
       number =input.nextInt();
        System.out.println("number = "+number);
            */
        String name;
         System.out.print("Enter your Name : ");
         name=input.nextLine();
        System.out.println("Name : "+name);
    
    
    }
    
}
