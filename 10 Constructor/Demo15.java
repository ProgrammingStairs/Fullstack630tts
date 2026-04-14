// example showing the concept of array of object
import java.util.Scanner;
class Product{
    int pid;
    String name;
    double price;

    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product Id : ");
        pid = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter Product name : ");
        name = sc.nextLine();

        System.out.println("Enter Product Price : ");
        price = sc.nextDouble();
    }
    void display(){
        System.out.println("\nName : "+name+"\nProduct Id : "+pid+"\nPrice : "+price);
    }
}
class Demo15{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of product : ");
        int num = sc.nextInt();

        Product pobj[] = new Product[num];
        for(int i=0;i<num;i++){
            pobj[i] = new Product();
            pobj[i].getData();
        }
        System.out.println("Product Details : ");
        for(Product p : pobj){
            p.display();
        }
    }
}