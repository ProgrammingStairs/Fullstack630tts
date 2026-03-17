// example showing the concept of getter and setter method
class Demo{
    private int a;
    void setData(int a){ // setter method
        this.a = a;
    } 
    int getData(){ // getter method
        return a;
    }
}
class Demo3{
    public static void main(String args[]){
        Demo obj = new Demo();
        obj.setData(100);
        System.out.println("Value of a : "+obj.getData());
    }   
}