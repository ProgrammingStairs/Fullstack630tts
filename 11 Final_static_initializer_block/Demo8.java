// example showing the concept of static keyword

// class Demo8{
//     static void display(){
//         System.out.println("display method called");
//     } 
//     public static void main(String args[]){
//         display();
//         Demo8.display();
//     }
// }

// class Demo{
//     static void display(){
//         System.out.println("display method called");
//     } 
// }
// class Demo8{
//     public static void main(String args[]){
//         Demo.display();
//     }
// }

class Demo8{
    static int count=0;
    Demo8(){
        count++;
    }
    static int getCount(){
        return count;
    }
    public static void main(String args[]){
        new Demo8();
        new Demo8();
        new Demo8();
        System.out.println("No. of objects created : "+getCount());
    }
}
