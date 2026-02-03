import java.util.Scanner;
class E{
    double k,t1,t2;
    E(double k,double t1,double t2){
        this.k=k;
        this.t1=t1;
        this.t2=t2;
    }
    void energy(){
        System.out.println("the energy needed is:"+(k*(t2-t1)*4184.0));
    }
}
public class Case2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter amount of water in kilograms:");
        double k=sc.nextFloat();
        System.out.println("enter the initial temperature:");
        double t1=sc.nextFloat();
        System.out.println("enter the final temperature");
        double t2=sc.nextFloat();
        
        E e=new E(k,t1,t2);
        e.energy();
        sc.close();
    }
    
}
