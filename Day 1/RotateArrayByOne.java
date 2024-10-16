//Given an array, the task is to cyclically rotate the array clockwise by one time.
class RotateArrayByOne{
    public static void rotate(int arr[]){
        int temp = arr[arr.length-1];
        for (int i = arr.length-1; i>0; i--) {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
    public static void main(String[] args) {
        System.out.println("Given Array is: ");
        int arr[] = {5,66,7,8,9};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\nCyclic array is: ");
        rotate(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}