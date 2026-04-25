// example
class Demo2{
    private int rno;  // data member
    public void display(){ // member function
        System.out.println("Roll Number : "+rno);
    }
    public static void main(String args[]){
        Demo2 obj = new Demo2();
        System.out.println("rno : "+obj.rno);
        obj.display();
    }
}