// example showing the concept of nested class in java
// static nested class 

class EnclosingClass{
    private static int age = 65;
    static String name = "Andrew Anderson";
    // static nested class 
    static class StaticNestedClass{
        void display(){
            System.out.println("Age : "+age);
            System.out.println("Name : "+name);
        }
    }
}
class Demo2{
    public static void main(String args[]){
        EnclosingClass.StaticNestedClass obj = new EnclosingClass.StaticNestedClass();
        obj.display();
    }
}