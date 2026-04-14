// example showing the concept of array of object
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
class Demo14{
    public static void main(String args[]){
        Product pobj[] = new Product[2];
        System.out.println("pobj[0] : "+pobj[0]);
        System.out.println("pobj[1] : "+pobj[1]);

        pobj[0] = new Product(10101,"Soap",67.78);
        pobj[1] = new Product(18789,"Fairness Cream",6327.78);
        
        System.out.println("pobj[0] : "+pobj[0]);
        System.out.println("pobj[1] : "+pobj[1]);

        System.out.println("Product Details : ");
        for(Product p : pobj){
            p.display();
        }
    }
}