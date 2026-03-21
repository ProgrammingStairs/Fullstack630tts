// Example showing the concept of array

import java.util.Scanner;
class Demo5{
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
        int count=0;
        System.out.println("Array elements are : ");
       for(i=0;i<arr.length;i++){
            if(arr[i]%2==0 && arr[i]%10!=0)
                count++;
            System.out.print("\t"+arr[i]);
       }
        System.out.print("\nDivisible by 2 but not 10 : "+count);
    }
}