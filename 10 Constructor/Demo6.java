// Example showing the concept of Constructor
import java.util.Scanner;
class Demo6{
    // instance variables
    String name;
    int rno;
    double per;
    // No Argument constructor
    Demo6(){
        System.out.println("No-argument constructor");
    }
    // Parameterized constructor
    Demo6(int rno,String name,double per){
        this.name = name;
        this.rno = rno;
        this.per = per;
        System.out.println("Parameterized constructor called");
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

        Demo6 obj = new Demo6(rno,name,per);        
        Demo6 objNew = new Demo6();
        obj.display();
    }
}