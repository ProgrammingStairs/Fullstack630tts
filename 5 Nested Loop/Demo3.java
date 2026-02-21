// example showing the concept of nested loop

class Demo3{
    public static void main(String args[]){
        for(int i=1;i<=3;i++){
            System.out.println("\ti : "+i);
            for(int j=1;j<=3;j++){
                if(i==2 && j==2)
                    continue;
                System.out.println("\t\tj : "+j);
            }
        }
        System.out.println("End of Program");
    }
}