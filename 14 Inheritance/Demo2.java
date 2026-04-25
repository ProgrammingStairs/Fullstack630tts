// example showing the concept of super keyword

class Parent{
    Parent(){
        System.out.println("Parent class constructor called");
    }
    String name = "Peter Parker";
    void show(){
        System.out.println("show method called of parent : "+name);
    }
}
class Child extends Parent{
    // Child(){
    //     super(); // super must be the first statement in constructor called
    //     System.out.println("Child class constructor called");
    // }
    String name = "Andrew Anderson";
    void show(){
        System.out.println("show method called of child : "+name);
    }
    void view(){
        System.out.println("Parent name : "+super.name);
        System.out.println("Child name : "+name);
        super.show();
        show();
    }
}
class Demo2{
    public static void main(String args[]){
        Child cobj = new Child();
        cobj.view();
    }
}