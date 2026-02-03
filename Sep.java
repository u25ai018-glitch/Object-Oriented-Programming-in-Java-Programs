import java.util.*;
class Sep {
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the five digit number");
        long n=Sc.nextLong();
        long a;
        System.out.println("entered number is:"+n);
        System.out.println("Separated number into its individual digits is:");
        for(int i=0;i<5;i++){
            a=n/10000;
            System.out.print("\t"+a);
            n=n%10000;
            n=n*10;
    
           
            

        }
        Sc.close();
    }
    
}
