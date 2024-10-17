public class CountZeroAndOne {
    public static void main(String[] args) {
        int arr[] = {0,1,0,0,1,6,1,0,1,1,0,0,1,1};
        int zero = 0;
        int one = 0;
        for(int i= 0; i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            } else if(arr[i]==1){
                one++;
            }
        }
        System.out.println("No. of zeroes "+ zero);
        System.out.println("No. of ones "+ one);
    }
    
}
