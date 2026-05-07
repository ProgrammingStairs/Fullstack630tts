// example showing the concept of Interface

// interface Showable{
//     int age=18;
// }
// class Demo4{
//     public static void main(String args[]){
//         System.out.println("Age : "+Showable.age);
//     }
// }


// interface Showable{
//     int age=18;
// }
// class Demo4 implements  Showable{
//     public static void main(String args[]){
//         System.out.println("Age : "+age);
//     }
// }


interface Showable{
    int age=18;
}
interface Movable{
    int age=28;
}
class Demo4{
    public static void main(String args[]){
        System.out.println("Age : "+Showable.age);
        System.out.println("Age : "+Movable.age);
    }
}
