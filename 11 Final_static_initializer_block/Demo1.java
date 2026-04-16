// example showing the concept of final keyword

class Demo1{
    final int a;
    Demo1(){
        a = 3456;
    }
    public static void main(String args[]){
        Demo1 obj = new Demo1();
        System.out.println("value of a : "+obj.a);
    }
}