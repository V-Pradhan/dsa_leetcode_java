import java.util.*;

public class Intersection {
    
    public static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();

        for (int x : nums1) {
            set1.add(x);
        }

        for (int x : nums2) {
            if (set1.contains(x)) {
                resultSet.add(x);
            }
        }

        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int x : resultSet) {
            result[i++] = x;
        }

        return result;
    }

    // main function (needed in VS Code to run)
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] ans = intersection(nums1, nums2);

        System.out.println(Arrays.toString(ans));
    }
}

    

