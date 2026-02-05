// WAP to check whether eneteRED YEAR IS leap year or not

import java.util.Scanner;
class Demo5{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter year : ");
       int year = sc.nextInt();
        String res = (year%4==0 && year%100!=0 ) || year%400==0 ? " year is a leap year " : "year is not a leap year"; 
       System.out.println("Result : "+res); 
    }   
}