class Product{
    int pid;
    String name;
    double price;

    Product(int pid,String name,double price){
        this.pid=pid;
        this.name=name;
        this.price=price;
    }
    void display(){
        System.out.println("\nName : "+name+"\nProduct Id : "+pid+"\nPrice : "+price);
    }
}
class Demo13{
    public static void main(String args[]){
        Product p1 = new Product(10101,"Soap",67.78);
        Product p2 = new Product(18789,"Fairness Cream",6327.78);
        
        System.out.println("Product Details : ");
        p1.display();
        p2.display();
    }
}