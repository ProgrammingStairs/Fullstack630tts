// Example showing the concept of array
// example to search an element from an array (Linear search)
import java.util.Scanner;
class Demo12{
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
       for(i=0;i<size;i++){
            System.out.print("\t"+arr[i]);
       }
        System.out.println("\nEnter element to search : ");
        int search = sc.nextInt();

      boolean status=false;  
      for(i=0;i<size;i++){
            if(arr[i] == search){
                System.out.println("\nElement found at position : "+(i+1));
                status = true;
            }
       }
        if(!status)
                System.out.println("\nElement not found");
        
    }
}