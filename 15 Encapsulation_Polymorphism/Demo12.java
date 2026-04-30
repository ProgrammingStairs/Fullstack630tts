// example showing the concept of run time polymorphism
class Parent{
    void display(){
        System.out.println("display of parent called");
    }
}
class Child extends Parent{
    @Override
    void display(){
        System.out.println("display of child called");
    }
}
class Demo12{
    public static void main(String args[]){
        Parent obj = new Child(); // upcasting
        obj.display();
    }
}