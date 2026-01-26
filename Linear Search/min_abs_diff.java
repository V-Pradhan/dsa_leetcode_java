import java.util.*;

public class min_abs_diff {

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Find minimum difference
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            minDiff = Math.min(minDiff, arr[i] - arr[i - 1]);
        }

        // Step 3: Store all pairs with minimum difference
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == minDiff) {
                result.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }

        return result;
    }

    // Main method for testing in VS Code
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3};

        List<List<Integer>> ans = minimumAbsDifference(arr);

        System.out.println(ans);
    }
}
