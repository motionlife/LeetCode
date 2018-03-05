/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {

    static int carry = 0;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null & carry == 0) return null;
        ListNode node = new ListNode(0);
        int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
        node.val = sum % 10;
        carry = sum / 10;
        node.next = addTwoNumbers(l1 == null ? null : l1.next, l2 == null ? null : l2.next);
        return node;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
