// example
class Demo{
    private int rno;  // data member
    public void setData(int rno){ // setter method - member function
        this.rno = rno;
    }
    public int getRno(){ // getter method -member function
        return rno;
    }
}
class Demo3{
    public static void main(String args[]){
        Demo obj = new Demo();
        obj.setData(100);
        System.out.print("Roll number : "+obj.getRno());
    }
}