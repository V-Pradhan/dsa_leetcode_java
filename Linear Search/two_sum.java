public class two_sum {
    public static void main(String args[]){
        int nums[] = {2,3,4,5,6};
        int target = 7;
        sum(nums,target);
    }

    public static void sum(int nums[], int target){
        for (int i = 0;i<nums.length;i++){
            for (int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println("The index of two numbers are " + i + " & " + j);
                    return;
                   
                }
            }
        }
        System.out.println("No sum found");
                
    }
    
}
