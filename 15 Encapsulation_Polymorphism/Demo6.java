// example showing the concept of constructor overloading
class Demo6{
    Demo6(double a,int b){
        double res = a>b?a:b;
        System.out.println("Greater Value : "+res);
    }
    Demo6(int a,double b){
        double res = a>b?a:b;
        System.out.println("Greater Value : "+res);
    }
    public static void main(String args[]){
        new Demo6(3.4,43);
        new Demo6(3,4.87);
    }
}