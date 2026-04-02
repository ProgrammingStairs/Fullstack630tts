// Example showing the concept of 2d array
// example showing the concept of jagged array
import java.util.Scanner;
class Demo21
{
    public static void main(String args[]){
       int arr[][] = new int[5][];
       int i,j;
       arr[0] = new int[]{1,2};
       arr[1] = new int[]{4,5,6,1,2};
       arr[2] = new int[]{1,2,44,3};
       arr[3] = new int[]{7,6,5,4,3,2,1,1,2};
       arr[4] = new int[]{1,2,3}; 

       System.out.println("\nArray elements are : \n");
    //    for(int ar[] : arr){
    //         for(int element : ar){
    //             System.out.print(element+"\t");
    //         }
    //         System.out.println();
    //    } 

        for(i=0;i<5;i++){
            for(j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

    }
}


















