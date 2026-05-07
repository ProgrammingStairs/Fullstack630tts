// example showing the concept of Interface

interface Showable{
    int age=18;
    void printAge();
}
class GetAge implements Showable{
    @Override
    public void printAge(){
        System.out.println("Age : "+age);
    }
}
class Demo5{
    public static void main(String args[]){
        Showable obj = new GetAge();
        obj.printAge();
    }
}
