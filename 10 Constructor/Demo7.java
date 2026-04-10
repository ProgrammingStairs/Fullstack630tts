// Example showing the concept of Constructor
import java.util.Scanner;
class Demo7{
    // instance variables
    String name;
    int rno;
    double per;
    // Parameterized constructor
    Demo7(int rno,String name,double per){
        this.name = name;
        this.rno = rno;
        this.per = per;
        System.out.println("Parameterized constructor called");
    }
    Demo7(Demo7 obj){
       name = obj.name;
       rno = obj.rno;
       per = obj.per;
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+rno);
        System.out.println("Percentage : "+per);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll Number : ");
        int rno = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter Name : ");
        String name = sc.nextLine();

        System.out.println("Enter Percentage : ");
        double per = sc.nextDouble();

        Demo7 obj = new Demo7(rno,name,per);
        obj.display();
        System.out.println("After copying : ");        
        Demo7 objNew = new Demo7(obj);
        objNew.display();
    }
}