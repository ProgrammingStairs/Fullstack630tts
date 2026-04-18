// example showing the concept of instance initializer block

class Demo12{
    final int a; // instance variable
    // instance initializer block
    // {
    //     a = 100;
    // }
    Demo12(){
        // super();
        // instance initializer block
        {
            a = 300;
        }
        // Constructor body
        System.out.println("No argument constructor called : a "+a);
    }
    public static void main(String args[]){
        new Demo12();
        // normal block
        {
            int a = 100;
            System.out.println("a : "+a);
        }
    }
}
