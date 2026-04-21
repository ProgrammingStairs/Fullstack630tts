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
}
class Demo2{
    public static void main(String args[]){
        Singleton.display();   
    }
}
