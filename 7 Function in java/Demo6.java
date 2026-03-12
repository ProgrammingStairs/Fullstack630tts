// example showing the concept of methods in java
// no argument with return type
import java.util.Scanner; 
class Demo6{
    // function definition
    int printFactorial(){  // here int represents integer return type
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact = fact * i;
        }
        return fact;
    }    
    public static void main(String args[]){
        Demo6 obj = new Demo6();
        // int res = obj.printFactorial(); // function calling + No argument
        // System.out.println("Factorial : "+res);

        System.out.println("Factorial : "+obj.printFactorial());
    }
}