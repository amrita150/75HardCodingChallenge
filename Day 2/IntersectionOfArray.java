import java.util.ArrayList;

public class IntersectionOfArray {
    //brute force approach
    public static ArrayList<Integer> intersection(int arr1[], int arr2[]){
        // int size = Math.min(arr1.length, arr2.length);
        ArrayList<Integer> inter = new ArrayList<>();
        for(int i = 0; i<arr1.length;i++){
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i]==arr2[j] && !inter.contains(arr1[i])){
                    inter.add(arr1[i]);
                }
            }
        }

        return inter;
    }
    public static void main(String args[]){
        int arr1[] = {6,2,3,4,1,7};
        int arr2[] = {3,1,5,2,7,4,4};

        ArrayList<Integer> inter = intersection(arr1,arr2);
        for(int i = 0; i<inter.size(); i++){
            System.out.print(inter.get(i) + " ");
        }
    }
}
