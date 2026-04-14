// Example showing the concept of Constructor chaining
// this can also be passed as an argument in constructor call 
class Test{
    TestDemo obj;
    Test(TestDemo obj){
        this.obj = obj;
    }
    void display(){
        System.out.println("Number : "+obj.num);
    }
}
class TestDemo{
    int num = 100;
    TestDemo(){
        Test test = new Test(this);
        test.display();
    }
}
class Demo12{
    public static void main(String args[]){
        new TestDemo();    
    }
}