// example showing the concept of recursion
import java.util.Scanner;
class Demo17{
    int power(int b,int e){
        if(e==0)
            return 1;
        else 
            return b * power(b,e-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and exponent : ");
        int b = sc.nextInt();
        int e = sc.nextInt();

        Demo17 obj = new Demo17();
        System.out.println("Factorial : "+obj.power(b,e));
    }
}





















