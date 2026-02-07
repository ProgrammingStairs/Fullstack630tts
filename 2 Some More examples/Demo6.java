// WAP to check whether entered character is a digit or not

import java.util.Scanner;
class Demo6{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter character : ");
       char ch = sc.next().charAt(0);
       String res = (ch>=48 && ch<=57) ? "Character is a digit" : "Character is not a digit"; 
       System.out.println("Result : "+res); 
    }   
}
/*
    ASCII VALUE = American standard code for information interchange

    A = 65     a = 97      0 = 48
    B = 66     b = 98      1 = 49
    |   |      |   |       |    |
    Z = 90     z = 122     9 = 57
*/ 