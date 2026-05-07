// example showing the concept of Interface

interface Showable{
    int age=18;
    void printAge();
}
class Demo6{
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
