import java.util.*;

class Caculate{
    float p,q,r,s,t;
    Caculate(float x, float y,float a,float b,float c ){
        
        this.p=x;
        this.q=y;
        this.r=a;
        this.s=b;
        this.t=c;
    }

 

    float cost(){
        System.out.println("total cost per day:");
        return(((p/q)*r)+s+t);

    
    }

}

public class DrivingCost{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter total miles driven per day:");
    float x=sc.nextFloat();
    System.out.println("enter average (miles/gallon): ");
    float y=sc.nextFloat();
    System.out.println("enter cost per gallon of gasoline");
    float a=sc.nextFloat();
    System.out.println("enter average fees per day:");
    float b=sc.nextFloat();
    System.out.println("tolls per day");
    float c=sc.nextFloat();

    Caculate t= new Caculate(x,y,a,b,c);
    float total=t.cost();
    System.out.println(total);
    sc.close();
    

    
}

}