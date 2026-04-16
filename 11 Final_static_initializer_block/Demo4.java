// example showing the concept of final keyword

class Demo4{
    public static void main(String args[]){
        final int arr[] = {1,2,3,4,5};
        int arr1[] = {33,44,55,66,77};
        arr1 = arr;
        System.out.println("Array elements are : ");
        for(int element : arr1){
            System.out.print("\t"+element);
        }
    }
}