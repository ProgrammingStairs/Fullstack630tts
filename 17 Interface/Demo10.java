// example showing the concept of Interface

interface Showable{
    default void display(){
        System.out.println("java8 interface default keyword");
        show1();
        show2();
    }
    static void show1(){
        System.out.println("show1 method called");
        System.out.println("statement 1");
        System.out.println("statement 2");
    }
    static void show2(){
        System.out.println("show2 method called");
        System.out.println("statement 1");
        System.out.println("statement 2");
    }

}
class Demo10 implements Showable{
    public static void main(String args[]){
        Showable obj = new Demo10();
        obj.display();
    }
}
