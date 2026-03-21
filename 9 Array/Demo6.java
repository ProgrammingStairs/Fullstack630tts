// Example showing the concept of array
// min and max element
import java.util.Scanner;
class Demo6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int i;
        int arr[] = new int[size];
        System.out.println("Enter array elements : ");
       for(i=0;i<size;i++){
        arr[i] = sc.nextInt();
       } 
       System.out.println("Array elements are : ");
       int min = arr[0], max = arr[0];
       for(i=0;i<arr.length;i++){
            if(min>arr[i])
                min = arr[i];
            if(max<arr[i])
                max = arr[i];
            System.out.print("\t"+arr[i]);
       }
        System.out.print("\nMinimum element : "+min);
        System.out.print("\nMaximum element : "+max);
    }
}