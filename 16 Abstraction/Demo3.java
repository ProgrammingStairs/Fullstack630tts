// Example showing the concept of method overriding
class RBI{
    double rate(){
        return 1.0;
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
class PNB extends RBI{}

class Demo3{
    public static void main(String args[]){
        SBI sobj = new SBI();
        BOI bobj = new BOI();
        PNB pobj = new PNB();
        System.out.println("Rate provided by sbi : "+sobj.rate());
        System.out.println("Rate provided by boi : "+bobj.rate());
        System.out.println("Rate provided by pnb : "+pobj.rate());
    }
}