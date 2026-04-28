// example showing the concept of method overriding
class Demo{
    void show(){
        System.out.println("show of parent called..!!");
    }
}
class Demo8 extends Demo{
    @Override
    void show(){
        System.out.println("show of child called..!!");
    }
    public static void main(String args[]){
        Demo8 obj = new Demo8();
        obj.show();
    }
}