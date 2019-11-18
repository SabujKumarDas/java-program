
package datatype;

import java.util.Scanner;


public class SelectionDemo {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        int num;
        System.out.println("Enter The Num: ");
        num=input.nextInt();
        
        if(num>0){
         System.out.println("This is a positive num");
         }
        
        else if(num<0){
        System.out.println("This is a negetive num");
        }
        else{
            System.out.println("This num is Zero");
        }
        
        
    }
}
