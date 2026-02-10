// example showing the concept of switch case
class Demo10{
    public static void main(String args[]){
        int i=1,num=10;
                
        switch(i++){
            case -4 : --num;
            case 2 : num++;
                        break;
            case 1 : --num; // 9
            case -3 : --num; // 8
            default : System.out.println("Result : "+ num++); // 8 
                        break;
        }
    }
}