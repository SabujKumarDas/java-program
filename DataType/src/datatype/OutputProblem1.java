
package datatype;


public class OutputProblem1 {
    public static void main(String[] args) {
        int a,b,c,d;
        a=10;
        b=5;
        c=++a - b--;//11-5=4
        d=b++ +a--;//4+11=15
        System.out.println("a ="+a);
        System.out.println("b ="+b);
        System.out.println("c ="+c);
        System.out.println("d ="+d);
        
        int x,y;
        x=13;
        y=++x +x++ +x++ +x++;//14+14+15+16=59
        System.out.println("x ="+x);
        System.out.println("y ="+y);
        
        int k,l,m=0;
        double p,q;
        k=m++ +5;//m=0, k=5 
        l=++k +5;//k=6, l=11
        p=k/2 + ++l;//k=3, l=12, p=15
        q=p++ +5;//p=15,q=20 
        System.out.println("k = "+k);
        System.out.println("l = "+l);
        System.out.println("m = "+m);
        System.out.println("p = "+p);
        System.out.println("q = "+q);
        
          int g=12, h;
          h=g++;
        System.out.println("g = "+g);
        System.out.println("h = "+h);
        
        int e,f,j;
        e=12; f=24;
        j=e%f-5;
        System.out.println("j ="+j);
        
        int x1=5, x2=3, x3=0;
        x3=++x1 + x1++ + ++x1;
        x2=x3 + ++x2;
        x1=++x1 + x1++ + ++x1;
        System.out.println("x1= "+x1);
        System.out.println("x2= "+x2);
        System.out.println("x3= "+x3);
        
        
        
    }
}
