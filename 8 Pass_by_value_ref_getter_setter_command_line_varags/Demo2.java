// example showing the concept of Pass by reference 
import java.util.Scanner;
class Demo2{
    int a,b;
    void swap(Demo2 obj){
        int temp = obj.a;
        obj.a = obj.b;
        obj.b = temp;
        System.out.println("After swapping in swap : \na : "+obj.a+"\nb : "+obj.b);
    }
    public static void main(String args[]){
        Demo2 obj = new Demo2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b : ");
        obj.a = sc.nextInt();
        obj.b = sc.nextInt();
        System.out.println("Before swapping : \na : "+obj.a+"\nb : "+obj.b);
            obj.swap(obj);
        System.out.println("After swapping in main : \na : "+obj.a+"\nb : "+obj.b);
    }   
}