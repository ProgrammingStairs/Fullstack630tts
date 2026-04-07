// Example showing the concept of 2d array
import java.util.Scanner;
class Demo24
{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter size : ");
       int size = sc.nextInt();
       int i,arr[] = new int[size];
       ArrayExample obj = new ArrayExample();
       
       arr = obj.getArrayElements(arr); 
        System.out.println("Array elements are : ");
        obj.printArrayElements(arr);
        
       arr = obj.getReverseArrayElements(arr); 
        System.out.println("\nArray elements after reversing : ");
        obj.printArrayElements(arr);
    }
}

















