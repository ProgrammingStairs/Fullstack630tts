// example showing the concept of multilevel inheritance
/*   
    class A (Area = l,b, getArea())
       |
       | class A is a parent of class B
       | class A is a grand parent of class C
       | 
    class B (Volume = h, getVolume())
       |
       | class B is a parent of class C
       | child of class A
       |
    class C (Density = m, getDensity())
       | class C is a child of class B
       | class C is a grand child of class A
*/

import java.util.Scanner;
class Area{
    int l,b;
    Area(int l,int b){
        this.l=l;
        this.b=b;
    }
    int getArea(){
        return l*b;
    }
}
class Volume extends Area{
    int h;
    Volume(int l,int b,int h){
        super(l,b);
        this.h=h;
    }
    int getVolume(){
        return getArea()*h;
    }
}
class Density extends Volume{
    double m;
    Density(int l,int b,int h,double m){
        super(l,b,h);
        this.m=m;
    }
    double getDensity(){
        return m/getVolume();
    }
}
class Demo4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter l,b,h and m : ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        double m = sc.nextDouble();
        
        Density obj = new Density(l,b,h,m);
        System.out.println("Area : "+obj.getArea());
        System.out.println("Volume : "+obj.getVolume());
        System.out.println("Density : "+obj.getDensity());
    }
}