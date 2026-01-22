class SingleNum {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}

public class SingleNumber {
    public static void main(String[] args) {
        SingleNum sol = new SingleNum();

        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        int[] nums3 = {1};

        System.out.println(sol.singleNumber(nums1)); // 1
        System.out.println(sol.singleNumber(nums2)); // 4
        System.out.println(sol.singleNumber(nums3)); // 1
    }
}
