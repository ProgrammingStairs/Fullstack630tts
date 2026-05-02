// Example showing the concept of abstract class
abstract class AbstractClass{
    abstract void display();    
}
class Demo1 extends AbstractClass{
    void display(){
        System.out.println("display method called...");
    }
    public static void main(String args[]){
        Demo1 obj = new Demo1();
        obj.display();
    }
}