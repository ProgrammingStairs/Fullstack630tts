// example showing the concept of final keyword

class Demo3{
    public static void main(String args[]){
        final int arr[] = {1,2,3,4,5};
        arr[2] = 1000;
        System.out.println("Array elements are : ");
        for(int element : arr){
            System.out.print("\t"+element);
        }
    }
}