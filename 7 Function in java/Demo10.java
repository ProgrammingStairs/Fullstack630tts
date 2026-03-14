// example showing the concept of methods in java

import java.util.Scanner; 
class Demo10{
    int a,b; // instance variable | Multiple copies with respectr to object
    void setData(int a1,int b1){
        a = a1;
        b = b1;
    }
    void add(){
        System.out.println("add : "+(a+b));
    }
    void sub(){
        System.out.println("sub : "+(a-b));
    }
    void mul(){
        System.out.println("mul : "+(a*b));
    }
    void div(){
        System.out.println("div : "+(a/b));
    }
    void mod(){
        System.out.println("mod : "+(a%b));
    }
    public static void main(String args[]){
        Demo10 obj = new Demo10();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        obj.setData(a,b);
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
        obj.mod();
    }
}