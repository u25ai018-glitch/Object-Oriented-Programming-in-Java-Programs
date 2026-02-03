import java.util.*;
class Rec{
    double x1,y1,x2,y2,w1,h1,w2,h2;
    Rec(double x1,double y1,double x2,double y2,double w1,double w2,double h1,double h2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        this.w1=w1;
        this.w2=w2;
        this.h1=h1;
        this.h2=h2;
    }
    void check(){
        
        if(Math.abs(x1-x2)<=(w1-w1)/2 && Math.abs(y1-y2)<=(h1-h2)/2){
            System.out.println("r2 is inside r1");

        }
         if(Math.abs(x1-x2)<(w1+w1)/2 && Math.abs(y1-y2)<(h1+h2)/2){
            System.out.println("r1 is overlaps r2");

        }
    }
}
public class Case5 {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter r1's center x-,y-coordinates,width,height");
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        double w1=sc.nextDouble();
        double h1=sc.nextDouble();

         System.out.println("enter r2's center x-,y-coordinates,width,height");
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();
        double w2=sc.nextDouble();
        double h2=sc.nextDouble();

        Rec c=new Rec(x1, y1, x2, y2, w1, w2, h1, h2);
        c.check();
        sc.close();
            
    }
    
}
