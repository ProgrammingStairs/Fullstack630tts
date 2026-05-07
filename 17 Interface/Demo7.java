// example showing the concept of Interface

abstract class Showable{
    int age=18;
    abstract void printAge();
}
class Demo7{
    public static void main(String args[]){
        Showable obj = new Showable(){
            @Override
            public void printAge(){
                System.out.println("Age : "+age);
            }
        };
        obj.printAge();
    }
}
