// compound interest

class Demo9{
    public static void main(String args[]){
        int p = 1000;
        double r = 4.5;
        int t = 3;
        double amt = p*Math.pow(1+r/100,t);
        System.out.println("Amount : "+amt);
        double ci = amt-p;
        System.out.printl n("Compound Interest : "+ci);
    }
}

