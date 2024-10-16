public class ReverseArray {
    
    public static void reverse(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int arr[] = {46,53,6,1,7};
        System.out.println("Array before reverse is: ");
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        reverse(arr);
        System.out.println("\nArray after reverse is: ");
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

}
