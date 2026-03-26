// Example showing the concept of array
// selection sort
import java.util.Scanner;
class Demo14
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int i,j,minIndex;
        int arr[] = new int[size];
        System.out.println("Enter array elements : ");
       for(i=0;i<size;i++){
        arr[i] = sc.nextInt();
       } 
       System.out.println("Array elements are : ");
       for(i=0;i<size;i++){
            System.out.print("\t"+arr[i]);
       }

       for(i=0;i<size-1;i++){
        minIndex = i;
        for(j=i+1;j<size;j++){
            if(arr[j]<arr[minIndex])
                minIndex = j;
        }
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
       }
       System.out.println("\nArray elements in ascending order : ");
       for(i=0;i<size;i++){
            System.out.print("\t"+arr[i]);
       }
    }
}


















