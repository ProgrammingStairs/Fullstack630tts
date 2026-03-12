// example showing the concept of methods in java
// no argument no return type
import java.util.Scanner; 
class Demo5{
    // function definition
    void printOddSeries(){  // here void represents no return type
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of terms : ");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            System.out.print(2*i-1+"\t");
        }
    }    
    public static void main(String args[]){
        Demo5 obj = new Demo5();
        obj.printOddSeries(); // function calling + No argument
    }
}