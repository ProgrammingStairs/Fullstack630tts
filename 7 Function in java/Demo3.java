// example showing the concept of methods in java 
class Demo3{
    public void display(){
        System.out.println("display method called");
    }    
    private void show(){
        System.out.println("show method called");
    }    
    protected void draw(){
        System.out.println("draw method called");
    }    
    public static void main(String args[]){
        Demo3 obj = new Demo3();
        obj.display();
        obj.show();
        obj.draw();
    }
}