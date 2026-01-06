public class missing_num_xor {
    public static void main(String[] args) {
        int nums[] ={2,3,5,1,6,7};
        int xor = 0;
        int n = nums.length;
        for(int i = 0;i<=n;i++){
            xor = xor^ i;
        }
        for(int i=0;i<n;i++){
            xor = xor ^ nums[i];
        }
        System.out.println("The missing number is: "+xor);
    }
    
}
