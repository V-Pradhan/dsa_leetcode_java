public class search {

    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    // main method for VS Code execution
    public static void main(String[] args) {
        search s = new search();
        int[] nums = {1, 3, 5, 6};

        System.out.println(s.searchInsert(nums, 5)); // 2
        System.out.println(s.searchInsert(nums, 2)); // 1
        System.out.println(s.searchInsert(nums, 7)); // 4
    }
}
