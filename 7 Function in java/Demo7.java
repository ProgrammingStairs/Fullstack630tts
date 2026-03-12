// example showing the concept of methods in java
// with argument no return type
import java.util.Scanner; 
class Demo7{
    // function definition
    void addValues(int a,int x){ 
        System.out.println("Sum : "+(a+x));
    }    
    public static void main(String args[]){
        Demo7 obj = new Demo7();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        obj.addValues(a,b); // passing values
    }
}