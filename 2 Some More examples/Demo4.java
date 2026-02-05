// WAP to check whether eneterd no. is even or odd

import java.util.Scanner;
class Demo4{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter value of a : ");
       int a = sc.nextInt();
       String res = (a%2==0) ? "Even Number" : "Odd Number"; 
       System.out.println("Result : "+res); 
    }   
}