// example to find out factors of all the numbers between two entered numbers

import java.util.Scanner;
class Demo6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial and final numbers : ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int num=n+1 ; num<m ; num++){
            System.out.print("\nFactors of "+num+" : ");
            for(int j=1;j<=num;j++){
                if(num%j==0)
                    System.out.print("\t"+j);
            }
        }
    }
}