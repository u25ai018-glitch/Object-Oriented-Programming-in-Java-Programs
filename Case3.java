import java.util.Scanner;
class Mrl{
    double v,a;
    Mrl(double v,double a){
        this.v=v;
        this.a=a;
    }
    void length(){
        System.out.println("the minimum runway length for this airplane:"+((v*v)/(2*a)));
    }
}

public class Case3 {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter speed:");
        double v=sc.nextFloat();
        System.out.println("enter acceleration:");
        double a=sc.nextFloat();
        
        
        Mrl l=new Mrl(v,a);
        l.length();;
        sc.close();
    }
    
}
