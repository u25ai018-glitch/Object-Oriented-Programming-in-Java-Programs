import java.util.Scanner;
class Charge{
    double hrs;

    Charge(double hrs){
        this.hrs = hrs;
    }

    double Cost() {
        if (hrs <= 3) {
            return (2.0);
        }
        else if(hrs <=19){
            return(2.0 + (hrs-3)*0.5);
        }
        else if(hrs < 24){
            return(10.0);
        }
        else{
            System.out.print("Kindly enter the correct no of hours.");
            return(0);
        }
    }

}
public class ParkingGarage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int flag = 0, i = 1;
        double sum = 0;

        while(flag != 1){
            System.out.println("Customer:"+i);
            System.out.print("Hrs:");
            double hrs = sc.nextDouble();

            Charge tarriff = new Charge(hrs);

            System.out.println("Parking Charge:"+String.format("%.2f",tarriff.Cost()));
            System.out.print("Enter 0 to continue and 1 to exit:");
            int a = sc.nextInt();
            flag = a;
            i++;
            sum += tarriff.Cost();
            System.out.println("------------------");
        }
        System.out.println("Total of Rs." + sum + " was collected yesterday.");

        sc.close();
    }
}
