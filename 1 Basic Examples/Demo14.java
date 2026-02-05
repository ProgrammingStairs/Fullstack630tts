// swapping of two numbers (without using third variable)

class Demo14{
    public static void main(String args[]){
        int a = 5,b = 6;
        System.out.println("Before swapping : \na : "+a+"\nb : "+b);
        //    a = a+b;
        //    b = a-b;
        //    a = a-b;

        //    a = a*b;
        //    b = a/b;
        //    a = a/b;

        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After swapping : \na : "+a+"\nb : "+b);
    }
}















 