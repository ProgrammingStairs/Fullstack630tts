// example showing the concept of methods in java
class Demo14{
    int a,b; // by default a = 0, b = 0
    public static void main(String args[]){
        Demo14 obj = new Demo14();
        System.out.println("value of a (obj): "+obj.a);
        System.out.println("value of b (obj): "+obj.b);
        obj.a += 100;
        obj.b += 200;
        System.out.println("value of a (obj): "+obj.a);
        System.out.println("value of b (obj): "+obj.b);
        
        Demo14 obj1 = new Demo14();
        System.out.println("value of a (obj1): "+obj1.a);
        System.out.println("value of b (obj1): "+obj1.b);
    }
}