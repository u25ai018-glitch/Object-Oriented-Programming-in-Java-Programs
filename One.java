import java.util.Scanner;
class Data{
    int a;
    int b;

    Data(int x, int y) {
        this.a = x;
        this.b = y;
    }
    int sum(){
        return(a+b);
    }
    int diff(){
        return(a-b);
    }
    int product(){
        return(a*b);
    }
    int quotient(){
        return(a/b);
    }
}

public class One{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int x = sc.nextInt();
        System.out.println("Enter Second Number:");
        int y = sc.nextInt();

        Data d = new Data(x,y);
        int add = d.sum();
        int sub = d.diff();
        int mul = d.product();
        int div = d.quotient();

        System.out.println("Sum:"+ add);
        System.out.println("Difference:"+ sub);
        System.out.println("Multiplication:"+ mul);
        System.out.println("Division:"+ div);
        sc.close();
    }
}
    

