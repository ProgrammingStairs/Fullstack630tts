// Example showing the concept of array

import java.util.Scanner;
class Demo3{
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
       for(i=0;i<arr.length;i++){
            System.out.print("\t"+arr[i]);
       }
        System.out.println("\nSum of first and last element : "+(arr[0]+arr[size-1]));
       
    }
}