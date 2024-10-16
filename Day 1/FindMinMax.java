
public class FindMinMax {
    public static int maxFind(int arr[]){
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
         if(maxVal<arr[i]){
            maxVal = arr[i];
         }   
        }

        return  maxVal;
    }

    public static int minFind(int arr[]){
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
         if(minVal>arr[i]){
            minVal = arr[i];
         }   
        }

        return  minVal;
    }


    
    public static void main(String args[]){
        int arr[] = {46,53,61,-7};
        int res = maxFind(arr);
        System.out.println("max value is: " + res);
        int res2 = minFind(arr);
        System.out.println("min value is: " + res2);
    }

}
