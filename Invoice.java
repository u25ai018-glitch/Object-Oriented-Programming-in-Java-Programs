import java.util.*;
public class Invoice {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        getInvoiceAmount g1=new getInvoiceAmount();
        System.out.println("enter a part number");
        g1.num=sc.nextLine();
        System.out.println("enter part description");
        g1.des=sc.nextLine();
        System.out.println("enter quantity of the item being purchased");
        g1.qua=sc.nextInt();
        System.out.println("enter price per item\n");
        g1.pri=sc.nextDouble();
        g1.giveinfo();
        sc.close();


    }

    
}
class getInvoiceAmount{
    String num,des;
    int qua;
    double pri;

    void giveinfo(){
        System.out.println("*****************INVOICE*********************");
        System.out.println("\na part number:"+this.num);
        System.out.println("\npart description:"+this.des);
        if(this.qua<0){
            this.qua=0;
        }
        System.out.println("\nquantity of the item being purchased:"+this.qua);
        if(this.pri<0){
            this.pri=0;
        }
        System.out.println("\nprice per item:"+this.pri);
        System.out.println("\ntotal amount is:"+(this.qua*this.pri));




    }



}
