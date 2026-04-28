// example showing the concept of method overriding
class Demo{
    protected void show(){
        System.out.println("show of parent called..!!");
    }
}
class Demo9 extends Demo{
    @Override
    public void show(){
        System.out.println("show of child called..!!");
    }
    public static void main(String args[]){
        Demo9 obj = new Demo9();
        obj.show();
    }
}