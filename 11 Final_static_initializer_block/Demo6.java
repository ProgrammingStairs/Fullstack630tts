// example showing the concept of static keyword

class Demo6{
    static String name; 
    static{
        name = "Andrew";
        System.out.println("statement 1 | "+name);
    }
    public static void main(String args[]){
        System.out.println("statement 2");      
        System.out.println("in main name : "+name);  
    }
}

