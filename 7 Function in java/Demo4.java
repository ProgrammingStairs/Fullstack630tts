// example showing the concept of methods in java 
class Demo4{
    void display(){
        System.out.println("display method called");
        System.out.println("this : "+this);
        draw(); // this.draw();
    }    
    void show(){
        System.out.println("show method called");
    }    
    void draw(){
        System.out.println("draw method called");
        show();
    }    
    public static void main(String args[]){
        Demo4 obj = new Demo4();
        System.out.println("obj : "+obj);
        obj.display();
    }
}