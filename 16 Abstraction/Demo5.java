// Example showing the concept of abstract class and abstract method
import java.util.Scanner;
abstract class RBI{
    // constructor
    RBI(){
      System.out.println("#####  Welcome To Bank  #####");  
    }
    // abstrat method
    abstract double rate();
    // concrete method
    double finalSum(int bal,double rate){
        return bal+bal*rate/100;
    }
}
class BOI extends RBI{
    @Override
    double rate(){
        return 1.34;
    }
}
class SBI extends RBI{
    @Override
    double rate(){
        return 2.28;
    }
}
class PNB extends RBI{
    @Override
    double rate(){
        return 2.98;
    }
}
class Demo5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Balance : ");
        int bal = sc.nextInt();

        RBI obj;
        obj = new SBI();
        System.out.println("Rate provided by sbi : "+obj.rate());
        System.out.println("Final Sum by sbi : "+obj.finalSum(bal,obj.rate()));
        
        obj = new BOI();
        System.out.println("Rate provided by boi : "+obj.rate());
        System.out.println("Final Sum by boi : "+obj.finalSum(bal,obj.rate()));
        
        obj = new PNB();
        System.out.println("Rate provided by pnb : "+obj.rate());
        System.out.println("Final Sum by pnb : "+obj.finalSum(bal,obj.rate()));
    }
}