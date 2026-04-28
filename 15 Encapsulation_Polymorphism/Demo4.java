// example showing the concept of method overloading
class Demo4{
    void greater(int a,int b){
        int res = a>b?a:b;
        System.out.println("Greater Value : "+res);
    }
    void greater(int a,int b,int c){
        int res = a>b ? a>c?a:c : b>c?b:c;
        System.out.println("Greater Value : "+res);
    }

    public static void main(String args[]){
        Demo4 obj = new Demo4();
        obj.greater(34,43);
        obj.greater(34,43,87);
    }
}