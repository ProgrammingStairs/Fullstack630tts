// example showing the concept of method overriding
class Demo{
    void show(int number){
        System.out.println("show of parent called..!! "+number);
    }
}
class Demo10 extends Demo{
    void show(double number){
        System.out.println("show of child called..!! "+number);
    }
    public static void main(String args[]){
        Demo10 obj = new Demo10();
        obj.show(100.43);
    }
}