
package datatype;


public class IncrementDecrementDemo {
    public static void main(String[] args) {
        int x=25,y;
        
        y=++x;//26
        System.out.println("y = "+y);
        
        y=x--;//26
        System.out.println("y = "+y);
        
        y=--x;//24
        System.out.println("y = "+y);
        
        y=x++;//24
        System.out.println("y = "+y);
        
    }
}
