// Example showing the concept of Constructor

class Demo3{
    // No-argument constructor
    Demo3(){
        String name = "Andrew Anderson";
        int rno = 101;
        double per = 89.32;
        System.out.println("No-Argument constructor called");
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+rno);
        System.out.println("Percentage : "+per);
    }
    public static void main(String args[]){
        Demo3 obj = new Demo3();        
    }
}