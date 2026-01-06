public class missing_num{
    public static void main(String args[]){
        int nums[] = {4,2,5,3,0};
        int n = nums.length;
        int actual_sum =0;
        int expected_sum =0;
        expected_sum = (n*(n+1))/2;
        for(int i =0;i<n;i++){
            actual_sum = actual_sum+nums[i];
        }
        int diff = expected_sum - actual_sum;
        System.out.println("missing number "+ diff);
    }


    
}