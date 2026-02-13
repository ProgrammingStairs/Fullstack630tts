// Program to pring n even numbers
import java.util.Scanner;
class Demo3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            System.out.print("\t"+2*i);
        }
    }
}
/*
       2   4    6   8   10 ...... 2xi
      2x1  2x2 2x3 2x4  2x5 .....  where i = 1,2,3,4,....
*/