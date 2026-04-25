// example
class Demo1{
    int rno;  // data member
    void display(){ // member function
        System.out.println("Roll Number : "+rno);
    }
    public static void main(String args[]){
        Demo1 obj = new Demo1();
        System.out.println("rno : "+obj.rno);
        obj.display();
    }
}