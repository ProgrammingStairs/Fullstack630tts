// Example showing the concept of 2d array
import java.util.Scanner;
class Demo16
{
    public static void main(String args[]){
        int i,j,r,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns : ");
        r = sc.nextInt();
        c = sc.nextInt();        
        int arr[][] = new int[r][c];

       System.out.println("Enter array elements : ");
       for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            arr[i][j] = sc.nextInt();
        }
       } 
       System.out.println("Array elements are : ");
        int sum = 0; 

       for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                System.out.print("\t"+arr[i][j]);
                //if(i==0 && j==0 || i==0&&j==c-1 || i==r-1&&j==0 || i==r-1&&j==c-1)
               // if(i==0 && (j==0 || j==c-1) || i==r-1 && (j==0 || j==c-1))
               if((i==0 || i==r-1) && (j==0 || j==c-1))  
                    sum+=arr[i][j]; 
            }
            System.out.println();
       }
    System.out.println("\nSum : \n"+sum);
        // for(int ar[] : arr){
        //     for(int element : ar){
        //         System.out.print(element+"\t");
        //     }
        //     System.out.println();
        // }
    }
}