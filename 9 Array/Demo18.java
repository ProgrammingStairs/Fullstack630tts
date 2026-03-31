// Example showing the concept of 2d array
// program to multiply two 2d array
import java.util.Scanner;
class Demo18
{
    public static void main(String args[]){
        int i,j,k,r1,c1,r2,c2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns of first matrix: ");
        r1 = sc.nextInt();
        c1 = sc.nextInt();        
        System.out.println("Enter rows and columns of second matrix: ");
        r2 = sc.nextInt();
        c2 = sc.nextInt();        
        if(c1!=r2){
            System.out.println("Multiplication not possible");
            System.exit(0);
        }

        int arr1[][] = new int[r1][c1];
        int arr2[][] = new int[r2][c2];
        int arr3[][] = new int[r1][c2];

       System.out.println("Enter first array elements : ");
       for(i=0;i<r1;i++){
        for(j=0;j<c1;j++){
            arr1[i][j] = sc.nextInt();
        }
       } 
       System.out.println("Enter second array elements : ");
       for(i=0;i<r2;i++){
        for(j=0;j<c2;j++){
            arr2[i][j] = sc.nextInt();
        }
       } 

       System.out.println("First Array elements are : ");
       for(i=0;i<r1;i++){
        for(j=0;j<c1;j++){
            System.out.print("\t"+arr1[i][j]);
        }
        System.out.println();
       } 
       System.out.println("Second Array elements are : ");
       for(i=0;i<r2;i++){
        for(j=0;j<c2;j++){
            System.out.print("\t"+arr2[i][j]);
        }
        System.out.println();
       } 

       for(i=0;i<r1;i++){
        for(j=0;j<c2;j++){
            arr3[i][j]=0;
            for(k=0;k<c1;k++){
                arr3[i][j] = arr3[i][j] + arr1[i][k]*arr2[k][j];
            }
        }
       }
       System.out.println("Resultant Array elements are : ");
       for(i=0;i<r1;i++){
        for(j=0;j<c2;j++){
            System.out.print("\t"+arr3[i][j]);
        }
        System.out.println();
       } 

    }
}