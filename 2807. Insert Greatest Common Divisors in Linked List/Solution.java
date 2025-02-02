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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head.next == null)
            return head;
        ListNode node1 = head;
        ListNode node2 = head.next;

        while (node2 != null) {
            int first = node1.val;
            int second = node2.val;

            while (second > 0) {
                int temp = second;
                second = first % second;
                first = temp;
            }

            ListNode newNode = new ListNode(first);
            newNode.next = node2;
            node1.next = newNode;

            node1 = node2;
            node2 = node2.next;
        }

        return head;
    }
}