// example showing the concept of static keyword

// class Demo7{
//     static String name="Andrew Anderson"; 
//     public static void main(String args[]){
//         System.out.println("in main name : "+name);  
//         System.out.println("in main name : "+Demo7.name);  
//     }
// }

class Demo{
    static String name="Andrew Anderson"; 
}
class Demo7{
    public static void main(String args[]){
        System.out.println("in main name : "+Demo.name);  
    }
}

