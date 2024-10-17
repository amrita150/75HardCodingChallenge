public class UniqueElement {
    //we use XOR because 1^1 = 0 and 1^0 = 1, we want to cancle out the same no. so we do XOR of all 
    //elemts which will give us only one value which is alone or unique
    public static int findUnique(int arr[]) {
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            ans = ans^arr[i];
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[] = {1,5,6,7,1,7,8,3,3,6,5};
        int unique = findUnique(arr);
        if(unique!=0){
        System.out.println("Unique element is: " + unique);
        } else{
        System.out.println("No unique element");
        }

    }
}
