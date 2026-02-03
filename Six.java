import java.util.Scanner;

interface Function{
    int evaluate(int x);
}

class Half implements Function{
    public int evaluate(int x){
        return x/2;
    }
}

public class Six {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("No of elements you want in array:");
    int n = sc.nextInt();

    int arr1[] = new int[n];
    int arr2[] = new int[n];
    Function halfFX = new Half();

    for(int i = 0; i < n; i++){
        System.out.print("Element "+ (i+1) +":");
        arr1[i] = sc.nextInt();
        arr2[i] = halfFX.evaluate(arr1[i]);
    }

    System.out.println("Before");
    for(int i = 0; i< n; i++){
        System.out.print(arr1[i] + " ");
    }
    System.out.println("");

    System.out.println("After");
    for(int i = 0; i< n; i++){
        System.out.print(arr2[i] + " ");
    }
    }
}
