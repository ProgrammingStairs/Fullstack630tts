// example showing the concept of nested class in java
// non-static nested class (Inner class) 

class EnclosingClass{
    private static int age = 65;
    String name = "Andrew Anderson";
    // non-static nested class 
    class NonStaticNestedClass{
        void display(){
            System.out.println("Age : "+age);
            System.out.println("Name : "+name);
        }
    }
}
class Demo4{
    public static void main(String args[]){
        EnclosingClass eobj = new EnclosingClass();
        EnclosingClass.NonStaticNestedClass obj = eobj.new NonStaticNestedClass();
        obj.display();
    }
}