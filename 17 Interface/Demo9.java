// example showing the concept of Interface

interface Showable{
    default void display(){
        System.out.println("java8 interface default keyword");
    }
    static void show(){
        System.out.println("java8 interface static keyword");
    }
}
class Demo9 implements Showable{
    public static void main(String args[]){
        Showable obj = new Demo9();
        obj.display();
        Showable.show();
    }
}
