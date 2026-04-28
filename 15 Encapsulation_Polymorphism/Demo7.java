// example showing the concept of method overloading
class Demo7{
    private static void main(int no){
        System.out.println("Number : "+no);
    } 
    public static void main(String name){
        System.out.println("Name : "+name);
    } 
    public static void main(String args[]){
        main(101);
        main("Hello Jack");    
    }
}