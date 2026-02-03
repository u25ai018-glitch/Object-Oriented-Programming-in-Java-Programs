abstract class figure{
    double pi=3.1420;
    double a;
    double v;

    public abstract void calcArea();
    public abstract void calcVol();
    public abstract void DispArea();
    public abstract void Dispvol();

}
class cone extends  figure{
    double r,l,h;
    cone(double r,double l,double h){
        this.r=r;
        this.l=l;
        this.h=h;

    }
    public void calcArea(){
        a=pi*r*l;
    }
    public void calcVol(){
        v=(1/3)*pi*r*r*h;
    }
    public void DispArea(){
        System.out.println("area of cone:"+a);

    }
    public void Dispvol(){
        System.out.println("volume of cone:"+v);

    }
    

}
class sphere extends figure{
    double r;
    sphere(double r){
        this.r=r;
    }
     public void calcArea(){
        a=4*pi*r*r;
    }
    public void calcVol(){
        v=(4/3)*pi*r*r*r;
    }
    public void DispArea(){
        System.out.println("area of sphere:"+a);

    }
    public void Dispvol(){
        System.out.println("volume of sphere:"+v);

    }
   


}
class cylinder extends figure{
    double h;
    double r;
     cylinder(double r,double h){
        this.r=r;
        this.h=h;
    }
     public void calcArea(){
        a=(2*pi*r*h)+(2*pi*r*r);
    }
    public void calcVol(){
        v=pi*r*r*h;
    }
    public void DispArea(){
        System.out.println("area of sphere:"+a);

    }
    public void Dispvol(){
        System.out.println("volume of sphere:"+v);

    }
   

}
public class Demotwo {
    public static void main(String args[]){
        cone c=new cone(5,8,10);
        c.calcArea();
        c.calcVol();
        c.DispArea();
        c.Dispvol();

        cylinder c1=new cylinder(4, 5);
        c1.calcArea();
        c1.calcVol();
        c1.DispArea();
        c1.Dispvol();

        sphere s=new sphere(4);
        s.calcArea();
        s.calcVol();
        s.DispArea();
        s.Dispvol();

        

    }

    
}
