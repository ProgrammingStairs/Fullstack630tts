// example 
class Demo6{
    void test(int a,int b){
        System.out.println("sum : "+(a+b));
    }
    void test(int a,int b,int c){
        System.out.println("sum : "+(a+b+c));
    }
    void test(int a,int b,int c,int d){
        System.out.println("sum : "+(a+b+c+d));
    }
    void test(int a,int b,int c,int d,int e){
        System.out.println("sum : "+(a+b+c+d+e));
    }
    public static void main(String args[]){
        Demo6 obj = new Demo6();
        obj.test(34,45);
        obj.test(43,34,45);
        obj.test(3,4,4,5);
        obj.test(1,2,3,4,5);
    }
}