// example showing the concept of inheritance 

class Parent{
    void show(){
        System.out.println("show method called of parent");
    }
}
class Child extends Parent{
    void display(){
        System.out.println("display method called of child");
    }
}
class Demo1{
    public static void main(String args[]){
        Child cobj = new Child();
        cobj.display();
        cobj.show();
    }
}