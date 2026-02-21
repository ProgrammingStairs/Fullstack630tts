// example showing the concept of do while loop
import java.util.Scanner;
class Demo20{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num,i=0;
        do{
            if(i!=0)
                System.out.println("Please Re-enter number : ");
            num = sc.nextInt();
            i++;
        }while(num<=0 || num>=100);
        System.out.println("Number : "+num);
    }
}
