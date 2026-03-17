// example showing the concept of recursion
import java.util.Scanner;
class Demo16{
    int fact(int n){
        if(n==0)
            return 1;
        else 
            return n * fact(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        Demo16 obj = new Demo16();
        System.out.println("Factorial : "+obj.fact(num));
    }
}