import java.util.*;
class Basic{
    public static void main(String args[]){
        System.out.println("Hello World");

    //take input from user
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter integer value: ");
    int val = sc.nextInt();
    System.out.println(val);

    //array declaration
    int arr[] = {7,6,4,3,2};

    //print array
    for(int i = 0; i<5; i++){
        System.out.print(arr[i] + " ");
    }

    //take array as input
    System.out.println("\n Enter size of an array: ");
    int n = sc.nextInt();
    
    //initialize array with given size
    int array[] = new int[n];
    System.out.print("Enter elements ");
    for(int i = 0; i<n; i++){
        array[i] = sc.nextInt();
    }
    
    System.out.println("Your array is: ");
    for(int i = 0; i<n; i++){
        System.out.print(array[i] + " ");
    }
 }

}