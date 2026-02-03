import java.util.Scanner;
class BMI{
    double w,h;
    BMI(double w,double h){
        this.w=w;
        this.h=h;
    }
    void calBMI(){
        System.out.println("BMI is:"+((w*0.45359237)/(h*h*0.0254*0.0254)));
    }
}


public class Case4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter weight in pounds:");
        double w=sc.nextFloat();
        System.out.println("enter height in inches:");
        double h=sc.nextFloat();
        
        
        BMI l=new BMI(w,h);
        l.calBMI();
        sc.close();
    }

}
