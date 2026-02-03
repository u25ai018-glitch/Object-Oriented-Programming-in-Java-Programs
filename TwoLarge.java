import java.util.Scanner;
class Two{
    int a;
    int b;

    Two(int x, int y) {
        this.a = x;
        this.b = y;
    }

    int larger(){
        if(a==b){
            System.out.println("Both numbers are equal.");
        }
        else if(a>b){
            System.out.println(a +" is greater.");
        }
        else{
            System.out.println(b +" is greater.");
        }
        return(0);
    }
}

public class TwoLarge{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int x = sc.nextInt();
        System.out.println("Enter Second Number:");
        int y = sc.nextInt();

        Two op = new Two(x,y);
        op.larger();
        sc.close();
        

    }
}