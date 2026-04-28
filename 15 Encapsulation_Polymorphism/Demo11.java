// example showing the concept of method overriding
class Demo{
    void show(int number){
        System.out.println("show of parent called..!! "+number);
    }
}
class Demo11 extends Demo{
    // @Override
    double show(double number){
        //System.out.println("show of child called..!! "+number);
        return number;
    }
    public static void main(String args[]){
        Demo11 obj = new Demo11();
        System.out.println(obj.show(10.90));
    }
}