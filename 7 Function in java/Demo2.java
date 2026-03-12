// example showing the concept of methods in java 

// class Demo2{
//     static void display(){
//         System.out.println("display method called");
//     }    
//     public static void main(String args[]){
//         display();
//     }
// }

class Demo2{
    void display(){
        System.out.println("display method called");
    }    
    public static void main(String args[]){
        Demo2 obj = new Demo2();
        obj.display();
        obj.display();
        obj.display();
    }
}