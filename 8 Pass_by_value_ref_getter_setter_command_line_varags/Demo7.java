// example showing the concept of Varargs
class Demo7{
    void test(int...num){
        System.out.println("No. of arguments : "+num.length);
        for(int element : num){
            System.out.print(element+"\t");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Demo7 obj = new Demo7();
        obj.test();
        obj.test(43,34,45);
        obj.test(3,4,4,5);
        obj.test(1,2,3,4,5);
    }
}