// example showing the concept of Pass by value 
import java.util.Scanner;
class Demo1{
    void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping in swap : \na : "+a+"\nb : "+b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Demo1 obj = new Demo1();
        System.out.println("Before swapping : \na : "+a+"\nb : "+b);
            obj.swap(a,b);
        System.out.println("After swapping in main : \na : "+a+"\nb : "+b);
    }   
}