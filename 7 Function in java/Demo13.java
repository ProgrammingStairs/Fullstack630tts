// example showing the concept of methods in java
// this keyword can also be passed as an argument in function call
class Demo13{
    void display(Demo13 obj){
        System.out.println("display method called : "+obj);
    }
    void show(){
        System.out.println("show method called");
        display(this);
    }
    public static void main(String args[]){
        Demo13 obj = new Demo13();
        obj.show();
    }
}