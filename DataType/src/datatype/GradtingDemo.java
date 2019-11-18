
package datatype;

import java.util.Scanner;


public class GradtingDemo {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int num;
        System.out.print("Enter the gradeting number : ");
        num=input.nextInt();
        
      
                if(num>=80 && num<=100)
                { 
                    System.out.println("Passed");
                    System.out.println("CGPA : A+");
                }    
               
                else if(num>=70 && num<=79)
                {
                    System.out.println("Passed");
                    System.out.println("CGPA : A");
                }
             
                else if(num>=60 && num<=69)
                {
                    System.out.println("Passed");
                    System.out.println("CGPA : A-");
                }
             
                else if(num>=50 && num<=59)
                {
                    System.out.println("Passed");
                    System.out.println("CGPA : B");
                }
           
                else if(num>=40 && num<=49)
                {
                    System.out.println("Passed");
                    System.out.println("CGPA : C");
                }
           
                else if(num>=33 && num<=39)
                {
                    System.out.println("Passed");
                    System.out.println("CGPA : D");
                }
            
                else if(num>=0 && num<=32)
                {
                    System.out.println("Failed");
                    System.out.println("CGPA : F");
                }
                else{
                    System.out.println("Invalid number");
              
                }
        
        
        
        
        
       
        
    }
}
