// example showing the concept of instance initializer block

class Demo11{
    int a; // instance variable
    // instance initializer block
    {
        a = 100;
    }
    Demo11(){
        // super();
        // instance initializer block
        // Constructor body
        System.out.println("No argument constructor called : a "+a);
    }
    public static void main(String args[]){
        new Demo11();
        // normal block
        {
            int a = 100;
            System.out.println("a : "+a);
        }
    }
}
