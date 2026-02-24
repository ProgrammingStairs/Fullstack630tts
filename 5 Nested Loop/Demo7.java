// example to find out  all the palindrome numbers between two entered numbers

import java.util.Scanner;
class Demo7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial and final numbers : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int rem,num1;
        for(int num=n+1 ; num<m ; num++){
            int rev = 0;
            num1 = num;
            while(num1>0){
                rem = num1%10;
                rev = rev * 10 + rem;   
                num1 = num1/10;
            }
            if(num==rev)
                System.out.print("\t"+rev);
        }
    }
}