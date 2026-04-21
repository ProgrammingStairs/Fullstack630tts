// example showing the concept of singleton class 
// Lazy initialization
class Singleton{
    private static Singleton instance;
    private Singleton(){}
    static Singleton getInstance(){
        if(instance==null){
            System.out.println("instance : "+instance);
            instance = new Singleton();
        }
        return instance; 
    }
    static void display(){
        System.out.println("Object created : "+instance);
    }
    int a = 100;
}
class Demo4{
    public static void main(String args[]){
        Singleton.display();   
        Singleton obj = Singleton.getInstance();
        System.out.println("value of a : "+obj.a);
        obj.a += 1000;
        System.out.println("value of a : "+obj.a);

        Singleton obj1 = Singleton.getInstance();
        System.out.println("value of a : "+obj1.a);
        
    }
}
