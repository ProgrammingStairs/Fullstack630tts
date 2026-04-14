// Example showing the concept of Constructor chaining
// this can be used to invoke current class constructor 
class Student{
    int rno;
    String name;
    double per;
    Student(){
        this(1001);
        System.out.println("default constructor called");
    }
    Student(int rno){
        this(rno,56.67);
    }
    Student(int rno,double per){
        this(rno,per,"Andrew Anderson");
    }
    Student(int rno,double per,String name){
        this.rno=rno;
        this.per=per;
        this.name=name;
        this.display();
    }
    void display(){
        System.out.println("Roll Number : "+rno);
        System.out.println("Percentage : "+per);
        System.out.println("Name : "+name);
    }
}
class Demo11{
    public static void main(String args[]){
        new Student();
    }
}