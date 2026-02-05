// sum of three digit number 

class Demo6{
    public static void main(String args[]){
        int num = 987;
        int last = num%10;
        int middle = (num/10)%10;
        int first = num/100;
        int res = first + middle + last;
        System.out.println("sum : "+res);
    }
}

