public class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    // MAIN method (entry point)
    public static void main(String[] args) {

        Solution sol = new Solution();

        // Creating linked list: 1 -> 1 -> 2 -> 3 -> 3
        ListNode head = new ListNode(1,
                new ListNode(1,
                new ListNode(2,
                new ListNode(3,
                new ListNode(3)))));

        head = sol.deleteDuplicates(head);

        // Print output
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}

// Helper class (NO main method needed)
class Solution {

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;

        while (current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}
