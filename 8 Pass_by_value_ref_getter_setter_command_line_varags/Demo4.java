// example showing the concept of getter and setter method
class Student{
    private String name;
    private int rno;
    // setter methods
    public void setName(String name){
        this.name=name;
    } 
    public void setRno(int rno){
        this.rno=rno;
    } 
    // getter methods
    public String getName(){
        return name;
    }
    public int getRno(){
        return rno;
    }
}
class Demo4{
    public static void main(String args[]){
        Student obj = new Student();
        obj.setName("Peter Parker");
        obj.setRno(100);
        System.out.println("Name : "+obj.getName());
        System.out.println("Roll Number : "+obj.getRno());
    }   
}