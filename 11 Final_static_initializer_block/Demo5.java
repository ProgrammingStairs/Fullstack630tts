// example showing the concept of static keyword

class Demo5{
    static{
        System.out.println("statement 1");
    }
    public static void main(String args[]){
        System.out.println("statement 2");        
    }
    static{
        System.out.println("statement 3");
    }
}

/*
    Static Keyword : 
        a. variable
        b. class 
        c. method 
        d. static block | static initializer block
*/ 