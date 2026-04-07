import java.util.Scanner;
class ArrayExample{
    // function to get array elements
    public int[] getArrayElements(int newArr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements : ");
        for(int i=0;i<newArr.length;i++){
            newArr[i] = sc.nextInt();
        }
        return newArr;
    }

    // function to reverse array elements
    public int[] getReverseArrayElements(int newArr[]){
        for(int i=0;i<newArr.length/2;i++){
            int temp = newArr[i];
            newArr[i] = newArr[newArr.length-1-i];
            newArr[newArr.length-1-i] = temp;
        }
        return newArr;
    }

    // function to print array elements
    public void printArrayElements(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print("\t"+arr[i]);
        }
    }

}














