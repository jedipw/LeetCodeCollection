/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        ListNode last;
        int length = 1;
        for (last = head; last.next != null; last = last.next) {
            length++;
        }
        if (n == length) {
            return head.next;
        }
        for (int i = 1; i < length - n; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        return head;
    }
}