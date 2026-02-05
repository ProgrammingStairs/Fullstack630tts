// WAP to perform increment and decrement operations

import java.util.Scanner;
class Demo3{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter value of a : ");
       int a = sc.nextInt();
    //    int res = a++ + --a + a++ + a-- - --a;
        // int res = ++a + ++a + a-- + --a + --a;
    //    int res = a++ + ++a - a-- - a++ + --a;
       int res = --a + --a - a-- - a++ - ++a;

       System.out.println("Result : "+res); 
    }   
}