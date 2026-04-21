// example showing the concept of singleton class 
// Eager initialization
class Singleton{
    final private static Singleton instance;
    static{
        instance = new Singleton();
    }
    private Singleton(){}
    static Singleton getInstance(){
        return instance; 
    }
    static void display(){
        System.out.println("Object created : "+instance);
    }
    int a = 100;
}
class Demo3{
    public static void main(String args[]){
        // Singleton.display();   
        Singleton obj = Singleton.getInstance();
        System.out.println("value of a : "+obj.a);
        obj.a += 1000;
        System.out.println("value of a : "+obj.a);

        Singleton obj1 = Singleton.getInstance();
        System.out.println("value of a : "+obj1.a);
        
    }
}
