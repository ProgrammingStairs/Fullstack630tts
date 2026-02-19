// example to check whether entered number is armstrong or not
import java.util.Scanner;
class Demo18{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        int temp = num, temp1 = num, count = 0, rem;
        double sum = 0;
        while(num>0){
            count++;
            num=num/10;
        }
        while(temp>0){
            rem = temp % 10;
            sum = sum + Math.pow(rem,count);
            temp = temp / 10;
        }
        if(temp1 == sum)
            System.out.println("Number is armstrong");
        else
            System.out.println("Number is not armstrong");
    }
}
