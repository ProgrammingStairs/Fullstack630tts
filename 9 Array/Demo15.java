// Example showing the concept of 2d array
class Demo15
{
    public static void main(String args[]){
        int i,j,r=3,c=3;
        // int arr[][] = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,8}
        // };

        int arr[][] = new int[][]{
            {1,2,3},
            {4,5,6},
            {7,8,8}
        };

       System.out.println("Array elements are : ");
       for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                System.out.print("\t"+arr[i][j]);
            }
            System.out.println();
       }
    }
}