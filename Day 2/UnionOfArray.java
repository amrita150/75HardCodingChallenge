//lets suppose we are not taking any duplicate value
public class UnionOfArray {
    //brute force approach
    public static int[] union(int arr1[], int arr2[]){
        int size = arr1.length + arr2.length;
        int union[] = new int[size];
        for(int i=0; i<arr1.length; i++){
            union[i] = arr1[i];
        } 
        int j = arr1.length;
        for(int i=0; i<arr2.length; i++){
            union[j]=arr2[i];
            j++;
        }
        return union;
    }
    public static void main(String args[]){
        int arr1[] = {6,2,3,4};
        int arr2[] = {1,5,8};

        int arr3[] = union(arr1,arr2);
        for(int i = 0; i<arr3.length; i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
