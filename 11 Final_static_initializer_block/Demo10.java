// example showing the concept of static keyword

import java.util.Scanner;
class Student{
    int rno;
    String name;
    static String cname;
    static void getCollegeName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter college name : ");
        cname = sc.nextLine();
    }
    Student(int rno,String name){
        this.rno=rno;
        this.name=name;
    }
    void display(){
        System.out.println("\nName : "+name+"\nRoll Number : "+rno+"\nCollege Name : "+cname);
    }
}
class Demo10{
    public static void main(String args[]){
        Student.getCollegeName();
        Student s1 = new Student(101,"Andrew Anderson");
        Student s2 = new Student(102,"Peter Parker");
        s1.display();
        s2.display();
    }
}
