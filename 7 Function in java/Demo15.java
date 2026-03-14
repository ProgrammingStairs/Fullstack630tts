// example showing the concept of methods in java
// this keyword is used to return current class instance
class Demo15{
    int a , b;
    Demo15 setData(){
        this.a = 120;
        this.b = 456;
        return this;
    }
    void display(){
        System.out.println("value of a : "+a);
        System.out.println("value of b : "+b);
    }
    public static void main(String args[]){
        Demo15 obj = new Demo15();
        Demo15 instance =  obj.setData();
        instance.display();
    }
}