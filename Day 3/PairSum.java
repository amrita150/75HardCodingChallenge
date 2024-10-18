public class PairSum {
    //brute force apprpach
    public static int[] pairSum(int arr[], int sum){
        for(int i = 0 ; i<arr.length;i++){
            for(int j = i+1; j<arr.length;j++){
                if(arr[i]+arr[j] == sum){
                    return new int[] {arr[i], arr[j]};
                }
            }
        }
        return null;
    }

    

   public static void main(String[] args) {
    int arr[] = {1,3,4,6,7,2,8};
    int sum = 6;

    int arr2[] = pairSum(arr, sum);
    if(arr2 != null){
        for(int i = 0; i < 2; i++){
            System.out.print(arr2[i] + " ");
        }
    } else {
        System.out.println("No pair found");
    }
   }    
}
