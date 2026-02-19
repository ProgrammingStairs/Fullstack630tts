// example to count no. of digits
import java.util.Scanner;
class Demo17{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        System.out.println("Digits : "+count);
        System.out.println("Original Number : "+num);
    }
}
