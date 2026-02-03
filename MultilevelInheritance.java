class X{
    int i,j;

    X(int i,int j){
        this.i=i;
        this.j=j;

    }
    

    public int sum(){
        return i+j;

    }

}
class Y extends X{

    Y(int i,int j){
        super(i, j);
    }
    public int product(){
        return i*j;
    }
}
class Z extends Y{
    Z(int i,int j){
        super(i, j);
    }
    public int difference(){
        return i-j;
    }
}
public class MultilevelInheritance {
    public static void main(String args[]){
        Z z=new Z(14, 11);
        System.out.println("sum is:"+(z.sum()));
        System.out.println("difference is:"+(z.difference()));
        System.out.println("product is:"+(z.product()));


    }
}
