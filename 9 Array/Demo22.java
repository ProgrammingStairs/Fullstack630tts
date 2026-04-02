// Example showing the concept of 2d array
// example showing the concept of jagged array
import java.util.Scanner;
class Demo22
{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter no. of rows : ");
       int r = sc.nextInt();
       int arr[][] = new int[r][];
       int i,j;

       for(i=0;i<r;i++){
        System.out.println("Enter column for "+(i+1)+" row : ");
        int c = sc.nextInt();
        arr[i] = new int[c];
            System.out.println("Enter elements for "+(i+1)+" row : ");
            for(j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
       } 
       System.out.println("\nArray elements are : \n");
    //    for(int ar[] : arr){
    //         for(int element : ar){
    //             System.out.print(element+"\t");
    //         }
    //         System.out.println();
    //    } 

        for(i=0;i<r;i++){
            for(j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

    }
}


















