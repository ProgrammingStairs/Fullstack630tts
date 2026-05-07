// example showing the concept of nested class in java
// non-static nested class (Inner class) 

class EnclosingClass{
    void display(){ // member function
        NonStaticNestedClass obj = new NonStaticNestedClass();
        obj.display();
    }
    // non-static nested class | member class 
    class NonStaticNestedClass{
        void display(){
            System.out.println("display method of NonStaticNestedClass invoked");
        }
    }
}
class Demo5{
    public static void main(String args[]){
        EnclosingClass eobj = new EnclosingClass();
        eobj.display();
    }
}