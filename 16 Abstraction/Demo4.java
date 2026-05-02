// Example showing the concept of abstract class and abstract method
abstract class RBI{
    abstract double rate();
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
class Demo4{
    public static void main(String args[]){
        RBI obj;
        obj = new SBI();
        System.out.println("Rate provided by sbi : "+obj.rate());
        
        obj = new BOI();
        System.out.println("Rate provided by boi : "+obj.rate());
        
        obj = new PNB();
        System.out.println("Rate provided by pnb : "+obj.rate());
    }
}