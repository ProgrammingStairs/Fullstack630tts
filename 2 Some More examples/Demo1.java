// WAP to perform arithmetic operations

import java.util.Scanner;
class Demo1{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter value of a : ");
       int a = sc.nextInt();
       System.out.println("Enter value of b : ");
       int b = sc.nextInt();
       int c;

       c = a+b; 
       System.out.println(a+" + "+b+" = "+c); 
       c = a-b; 
       System.out.println(a+" - "+b+" = "+c); 
       c = a*b; 
       System.out.println(a+" * "+b+" = "+c); 
       c = a/b; 
       System.out.println(a+" / "+b+" = "+c); 
       c = a%b; 
       System.out.println(a+" % "+b+" = "+c); 

    }   
}