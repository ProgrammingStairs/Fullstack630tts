// example showing the concept of getter and setter method
class Demo5{
    public static void main(String args[]){
        Student obj = new Student();
        obj.setName("Peter Parker");
        obj.setRno(100);
        System.out.println("Name : "+obj.getName());
        System.out.println("Roll Number : "+obj.getRno());
    }   
}