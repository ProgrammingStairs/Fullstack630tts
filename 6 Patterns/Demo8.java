/*
    *
    ***
    *****
    *******
    *********

      2x1  2x2 2x3  2x4 2x5 .....  where i = 1,2,3,4....
        2   4   6   8   10  .....  2 x i
      1   3   5   7   9   .....    2 x i - 1
*/
import java.util.Scanner;
class Demo8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
