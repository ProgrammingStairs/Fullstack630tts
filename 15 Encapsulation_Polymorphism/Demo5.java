// example showing the concept of method overloading
class Demo5{
    void greater(double a,int b){
        double res = a>b?a:b;
        System.out.println("Greater Value : "+res);
    }
    void greater(int a,double b){
        double res = a>b?a:b;
        System.out.println("Greater Value : "+res);
    }
    public static void main(String args[]){
        Demo5 obj = new Demo5();
        obj.greater(3.4,43);
        obj.greater(3,4.87);
    }
}