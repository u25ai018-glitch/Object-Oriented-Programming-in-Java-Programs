import java.util.*;
 
 class Ra{
    int a;
    Ra(int r){
        this.a=r;

    }
    float dia(){
        return(2*a);

    }
    double cir(){
        return(2*Math.PI*a);
    }
    double are(){
        return(Math.PI*a*a);
    }
 }

  public class Circle {
    public static void main(String args[]){
        Scanner Sc= new Scanner(System.in);
        System.out.println("enter the radius of the circle");
        int r=Sc.nextInt();
        Ra b=new Ra(r);
        float d=b.dia();
        double c=b.cir();
        double ar=b.are();
        System.out.println("Diameter of the circle is:"+d);
        System.out.println("Circumfrence of the circle is:"+c);
        System.out.println("Area of the circle is:"+ar);
        Sc.close();



    }
    
}
