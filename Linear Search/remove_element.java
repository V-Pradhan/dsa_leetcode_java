import java.util.Arrays;

public class remove_element {
    
    // Function to remove all occurrences of val
    public static int removeElement(int[] nums, int val) {
        int k = 0; // index for valid elements

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    // Main method (VS Code execution starts here)
    public static void main(String[] args) {

        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        int k = removeElement(nums, val);

        System.out.println("k = " + k);
        System.out.print("Modified array (first k elements): ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }


}
