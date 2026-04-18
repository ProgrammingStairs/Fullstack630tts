// example showing the concept of static keyword

class Student{
    int rno;
    String name;
    static String cname="SVVV,Indore";

    Student(int rno,String name){
        this.rno=rno;
        this.name=name;
    }
    void display(){
        System.out.println("\nName : "+name+"\nRoll Number : "+rno+"\nCollege Name : "+cname);
    }
}
class Demo9{
    public static void main(String args[]){
        Student s1 = new Student(101,"Andrew Anderson");
        Student s2 = new Student(102,"Peter Parker");
        s1.display();
        s2.display();
    }
}
