public class binary_search_704 {
    public static void main(String args[]){
        int nums[] = {2,3,5,7,8,9,12};
        int target = 5;
        System.out.println(search(nums,target));
    }

    public static int search(int nums[],int target){
        int start = 0, end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
        
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start = mid +1;
            }
            else{
                end = mid - 1;
            }
            
            }
            
        
        return -1;

    }
}
    

