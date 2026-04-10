// Example showing the concept of Constructor
import java.util.Scanner;
class Demo8{
    // instance variables
    String name;
    int rno;
    double per;
    // Parameterized constructor
    Demo8(int rno,String name,double per){
        this.name = name;
        this.rno = rno;
        this.per = per;
        System.out.println("Parameterized constructor called");
    }
    // no argument constructor
    Demo8(){}
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

        Demo8 obj = new Demo8(rno,name,per);
        obj.display();
        System.out.println("After copying : ");        
        Demo8 objNew = new Demo8();
        objNew.name = obj.name;
        objNew.rno = obj.rno;
        objNew.per = obj.per;
        objNew.display();

    }
}