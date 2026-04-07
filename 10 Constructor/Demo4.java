// Example showing the concept of Constructor

class Demo4{
    // instance variables
    String name;
    int rno;
    double per;
    // No-argument constructor
    Demo4(){
        name = "Andrew Anderson";
        rno = 101;
        per = 89.32;
        System.out.println("No-Argument constructor called");
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+rno);
        System.out.println("Percentage : "+per);
    }
    public static void main(String args[]){
        Demo4 obj = new Demo4();        
        obj.display();
    }
}