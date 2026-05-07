// example showing the concept of nested class in java
// non-static nested class (Inner class) 

class EnclosingClass{
    void display(){ // member function
        // non-static nested class | local class 
        class NonStaticNestedClass{
            void display(){
                System.out.println("display method of NonStaticNestedClass invoked");
            }
        }
        NonStaticNestedClass obj = new NonStaticNestedClass();
        obj.display();
    }
}
class Demo6{
    public static void main(String args[]){
        EnclosingClass eobj = new EnclosingClass();
        eobj.display();
    }
}