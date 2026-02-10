// example showing the concept of switch case
import java.util.Scanner;
class Demo11{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter color : ");
        String color = sc.nextLine();

        switch(color.toLowerCase()){
            case "red" : System.out.println("Red color"); 
                        break;
            case "green" : System.out.println("Green color"); 
                        break;
            case "blue" : System.out.println("Blue color"); 
                        break;
            default : System.out.println("Invalid selection"); 
                        break;
        }
    }
}