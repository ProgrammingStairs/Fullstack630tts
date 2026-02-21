// example to print table of all the numbers between two entered numbers

import java.util.Scanner;
class Demo5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial and final numbers : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for(int num=n+1 ; num<m ; num++){
            for(int j=1;j<=10;j++){
                System.out.println(num+" x "+j+" = "+(num*j));
            }
            System.out.println();
        }
    }
}