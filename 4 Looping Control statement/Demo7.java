// Program to print fibonacci series
// 0    1   1   2   3   5   8   13  ....
import java.util.Scanner;
class Demo7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int a=-1,b=1,c=0;
        for(int i=1;i<=num;i++){
            c = a + b;
            System.out.print("\t"+c);
                a = b;
                b = c;
        }
    }
}
