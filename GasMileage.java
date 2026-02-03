import java.util.Scanner;
public class GasMileage{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("how many trip:");
     int n=sc.nextInt();
     
     float miles[] =new float[n];
     float gallons[]=new float[n];

     for (int i=0;i<n;i++){
        System.out.println("enter miles of trip"+(i+1));
        miles[i]=sc.nextFloat();
        System.out.println("enter gallons of trip"+(i+1));
        gallons[i]=sc.nextFloat();

        
     }
     float summiles=0,sumgallons=0;
       for (int i=0;i<n;i++){
        System.out.println("miles of trip"+(i+1)+":"+miles[i]);
        System.out.println("enter gallons of trip"+(i+1)+":"+gallons[i]);
        sumgallons=sumgallons+gallons[i];
        summiles=summiles+miles[i];
    }
    System.out.println("average miles per gallons is:"+(summiles/sumgallons));
    sc.close();
    }

}

