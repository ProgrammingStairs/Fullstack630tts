// Example showing the concept of 2d array
// program to add two 2d array
import java.util.Scanner;
class Demo17
{
    public static void main(String args[]){
        int i,j,r,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns : ");
        r = sc.nextInt();
        c = sc.nextInt();        
        int arr1[][] = new int[r][c];
        int arr2[][] = new int[r][c];
        int arr3[][] = new int[r][c];

       System.out.println("Enter first array elements : ");
       for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            arr1[i][j] = sc.nextInt();
        }
       } 
       System.out.println("Enter second array elements : ");
       for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            arr2[i][j] = sc.nextInt();
        }
       } 

       System.out.println("First Array elements are : ");
       for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            System.out.print("\t"+arr1[i][j]);
        }
        System.out.println();
       } 
       System.out.println("Second Array elements are : ");
       for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            System.out.print("\t"+arr2[i][j]);
        }
        System.out.println();
       } 

       System.out.println("Resultant Array elements are : ");
       for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            arr3[i][j] = arr1[i][j] + arr2[i][j];
            System.out.print("\t"+arr3[i][j]);
        }
        System.out.println();
       } 

    }
}