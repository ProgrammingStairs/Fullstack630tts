// example showing the concept of switch case
import java.util.Scanner;
class Demo8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();

        switch(num%2){
            case 0 : System.out.println("Even Number"); 
                        break;
            default : System.out.println("Odd Number"); 
                        break;
        }
    }
}