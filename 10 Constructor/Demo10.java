// Example showing the concept of Constructor
// deep copy
import java.util.Scanner;
class Address{
    String city;
    String state;
    Address(String city,String state){
        this.city=city;
        this.state=state;
    }
    Address(Address address){
        this.city = address.city;
        this.state = address.state;
    }
}
class Student{
    // instance variables
    String name;
    int rno;
    Address address;
    Student(int rno,String name,Address address){
        this.rno=rno;
        this.name=name;
        this.address=address;
    }
    Student(Student s1){
        name = s1.name;
        rno = s1.rno;
        address = new Address(s1.address);
    }
}
class Demo10{
    public static void main(String args[]){
        Address address = new Address("Indore","Madhya Pradesh");
        Student s1 = new Student(101,"Andrew Anderson",address);
        Student s2 = new Student(s1);

        s2.address.city = "Bhopal";
        s2.address.state = "M.P.";
        
        System.out.println("s1 details : ");
        System.out.println("Name : "+s1.name);
        System.out.println("Roll Number : "+s1.rno);
        System.out.println("Address : ");
        System.out.println("\tCity : "+s1.address.city);
        System.out.println("\tState : "+s1.address.state);

        System.out.println("\ns2 details : ");
        System.out.println("Name : "+s2.name);
        System.out.println("Roll Number : "+s2.rno);
        System.out.println("Address : ");
        System.out.println("\tCity : "+s2.address.city);
        System.out.println("\tState : "+s2.address.state);
        
    }
}