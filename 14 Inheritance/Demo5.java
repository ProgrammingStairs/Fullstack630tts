// example showing the concept of Hierarchical inheritance
/*   
                           |--name, age
                           |--getDetails()
                           |--showDetails()
                class A (Person)
        ___________|____________
        |                      |
    class B                class C
    (Student)              (Employer)    
    |--course, fees        |--desig,salary 
    |--getStudDetails()    |--getEmpDetails
         |--getDetails()       |--getDetails()
    |--showStudDetails()   |--showEmpDetails 
        |--showDetails()      |--showDetails()
*/

import java.util.Scanner;
class Person{
    String name;
    int age;
    void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Name : ");
        name = sc.nextLine();
        System.out.println("Enter Age : ");
        age = sc.nextInt();
    }
    void showDetails(){
        System.out.println("\nName : "+name);
        System.out.println("Age : "+age);
    }
}
class Student extends Person{
    String course;
    int fees;
    void getStudDetails(){
        getDetails();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Course Name : ");
        course = sc.nextLine();
        System.out.println("Enter Fees : ");
        fees = sc.nextInt();
    }
    void showStudDetails(){
        showDetails();
        System.out.println("Course Name : "+course);
        System.out.println("Fees : "+fees);
    }
}
class Employer extends Person{
    String desig;
    int salary;
    void getEmpDetails(){
        getDetails();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Designation : ");
        desig = sc.nextLine();
        System.out.println("Enter Salary : ");
        salary = sc.nextInt();
    }
    void showEmpDetails(){
        showDetails();
        System.out.println("Designation : "+desig);
        System.out.println("Salary : "+salary);
    }
}

class Demo5{
    public static void main(String args[]){
        Student s = new Student();
        s.getStudDetails();

        Employer e = new Employer();
        e.getEmpDetails();

        s.showStudDetails();
        e.showEmpDetails();
    }
}