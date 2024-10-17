import java.util.*;
public class LinearSearch {
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
          if(arr[i]==key){
            return i;
          }   
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of an array: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element you want to search: ");
        int key = sc.nextInt();
        int res = linearSearch(arr, key);
        if(res!=-1){
            System.out.println("Found!");
        } else{
            System.out.println("Not Found!");

        }
    }
}
