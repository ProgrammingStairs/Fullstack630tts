// example showing the concept of methods in java 

class Demo1{
    void display(){
        System.out.println("statement1");
        System.out.println("statement2");
        System.out.println("statement3");
        System.out.println("statement4");
    }
    public static void main(String args[]){
        Demo1 obj = new Demo1();
            obj.display();
        System.out.println("--------statement");
            obj.display();
        System.out.println("statement--------");
            obj.display();
        System.out.println("-----statement-------");
    }
}