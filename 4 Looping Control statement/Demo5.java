// Program
import java.util.Scanner;
class Demo5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            if(i%5==0)
                System.out.print("\tHello");
            else
                System.out.print("\t"+i);
        }
    }
}
