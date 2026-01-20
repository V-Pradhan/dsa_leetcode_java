import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class min_bit {
    public static void main(String[] args) {
        min_bit sol = new min_bit();
        
        // Test Case 1: Convert array to List to match LeetCode's likely input
        List<Integer> nums1 = Arrays.asList(2, 3, 5, 7);
        System.out.println("Input: [2, 3, 5, 7]");
        System.out.println("Output: " + Arrays.toString(sol.minBitwiseArray(nums1)));
        
        // Test Case 2
        List<Integer> nums2 = Arrays.asList(11, 13, 31);
        System.out.println("Input: [11, 13, 31]");
        System.out.println("Output: " + Arrays.toString(sol.minBitwiseArray(nums2)));
    }

    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int target = nums.get(i);
            
            // Special case: 2 is '10' in binary. No x | (x+1) can result in 2.
            if (target == 2) {
                ans[i] = -1;
            } else {
                // To minimize x, find the lowest '0' bit in 'target'.
                // The bit immediately to its right is the one we flip to 0.
                ans[i] = findMinX(target);
            }
        }
        return ans;
    }

    private int findMinX(int target) {
        // Iterate through bits to find the first 0 from the right
        for (int b = 0; b < 31; b++) {
            if (((target >> b) & 1) == 0) {
                // b is the position of the first 0.
                // Flip the 1 at position (b-1) to 0.
                int mask = 1 << (b - 1);
                return target ^ mask;
            }
        }
        return -1;
    }
}