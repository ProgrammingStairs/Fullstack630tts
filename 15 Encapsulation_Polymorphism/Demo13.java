// example showing the concept of run time polymorphism
class Parent{
    void display(){
        System.out.println("display of parent called");
    }
    void show(){
        System.out.println("show of parent called");
    }
}
class Child extends Parent{
    @Override
    void display(){
        System.out.println("display of child called");
    }
    void draw(){
        System.out.println("draw of child called");
    }
}
class Demo13{
    public static void main(String args[]){
        Parent obj = new Child(); // upcasting
        obj.display();
        obj.show();
        Child cobj = (Child)obj; // downcasting
        cobj.draw();
    }
}