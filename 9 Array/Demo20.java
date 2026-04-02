// Example showing the concept of 2d array
// example showing the concept of multi dimensional array
import java.util.Scanner;
class Demo20
{
    public static void main(String args[]){
        int i,j,k,r,c,size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of 2d matrix: ");
        size = sc.nextInt();
        System.out.println("Enter rows and columns of matrix: ");
        r = sc.nextInt();
        c = sc.nextInt();        
        int arr[][][] = new int[size][r][c];

       System.out.println("Enter array elements : ");
       for(i=0;i<size;i++){ // represents no. of 2d matrix
        System.out.println("\nEnter "+(i+1)+" matrix elements : \n");
            for(j=0;j<r;j++){ // represents rows
                for(k=0;k<c;k++){
                    arr[i][j][k] = sc.nextInt();
                }   
            }
       }

       System.out.println("\nArray elements are : \n");
       int count=1;
       for(int ar[][] : arr){
        System.out.println("\n"+count+" matrix : \n");
        for(int a[] : ar){
            for(int element : a){
                System.out.print(element+"\t");
            }
            System.out.println();
        }
        System.out.println();
        count++;
       }

    }
}