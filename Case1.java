class A{
    double v0;
    double v1;
    double t;

    A(double v0,double v1,double t){
        this.v0=v0;
        this.v1=v1;
        this.t=t;
    }

    void acceleration(){
        System.out.println("the average acceleration is:"+(v0-v1)/t);
        
    }
}
public class Case1 {
    public static void main(String[] args) {

        
           A a=new A(4562.65, 56.621, 44.656);
           a.acceleration();
        
    }
    
}
