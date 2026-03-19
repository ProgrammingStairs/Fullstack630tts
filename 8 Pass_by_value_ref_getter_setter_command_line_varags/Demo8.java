// example showing the concept of Varargs
class Demo8{
    void test(String name,int...num){
        System.out.println("No. of arguments : "+(num.length+1));
        System.out.print(name+"\t");
        for(int element : num){
            System.out.print(element+"\t");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Demo8 obj = new Demo8();
        obj.test("Andrew");
        obj.test("Mathew",43,34,45);
        obj.test("Jack",3,4,4,5);
        obj.test("Peter",1,2,3,4,5);
    }
}