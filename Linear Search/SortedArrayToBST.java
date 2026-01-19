import java.util.*;

public class SortedArrayToBST {

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {-10, -3, 0, 5, 9};
        TreeNode root1 = sol.sortedArrayToBST(nums1);
        System.out.println("BST Level Order: " + levelOrder(root1));

        int[] nums2 = {1, 3};
        TreeNode root2 = sol.sortedArrayToBST(nums2);
        System.out.println("BST Level Order: " + levelOrder(root2));
    }

    // Helper: print tree in level order (like LeetCode)
    public static List<Integer> levelOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            result.add(curr.val);

            if (curr.left != null) q.offer(curr.left);
            if (curr.right != null) q.offer(curr.right);
        }

        return result;
    }
}

class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums, 0, nums.length - 1);
    }

    private TreeNode buildBST(int[] nums, int left, int right) {
        if (left > right) return null;

        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = buildBST(nums, left, mid - 1);
        root.right = buildBST(nums, mid + 1, right);

        return root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

    

