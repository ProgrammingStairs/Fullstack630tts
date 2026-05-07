// example showing the concept of Interface

interface Showable{
    void show();
    void display();
}
interface Drawable{
    void show();
}

class Demo8 implements Showable,Drawable{
    @Override 
    public void display(){
        System.out.println("display method called");
    }
    @Override 
    public void show(){
        System.out.println("show method called");
    }
    
    public static void main(String args[]){
        Drawable obj = new Demo8();
        Showable objNew = new Demo8();
        obj.show();
        objNew.display();
    }
}
