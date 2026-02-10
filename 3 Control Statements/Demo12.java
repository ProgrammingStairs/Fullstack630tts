// example showing the concept of switch case
import java.util.Scanner;
class Demo12{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Select option : ");
        System.out.println("1 for Add");
        System.out.println("2 for Sub");
        System.out.println("3 for Mul");
        System.out.println("4 for div");
        System.out.println("0 for exit");

        System.out.println("Enter choice : ");
        int choice = sc.nextInt();

        switch(choice){
            case 1 : System.out.println("sum : "+(num1+num2)); 
                        break;
            case 2 : System.out.println("sub : "+(num1-num2)); 
                        break;
            case 3 : System.out.println("mul : "+(num1*num2)); 
                        break;
            case 4 : System.out.println("div : "+(num1/num2)); 
                        break;
            case 0 : System.exit(0);
            default : System.out.println("Invalid selection"); 
                        break;
        }
    }
}