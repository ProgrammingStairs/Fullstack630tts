// example showing the concept of methods in java
// with argument with return type
import java.util.Scanner; 
class Demo8{
    // function definition
    double avg(int a,int b,int c){ 
        return (a+b+c)/3.0;
    }    
    public static void main(String args[]){
        Demo8 obj = new Demo8();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Average : "+obj.avg(a,b,c)); // passing values
        System.out.printf("Average : %.2f",obj.avg(a,b,c)); // passing values
    }
}