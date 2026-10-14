/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        
        
        ListNode current = head;
        int n = 1;
        while (current.next != null) {
            current = current.next;
            n++;
        }
        
        
        current.next = head;
        
        
        k = k % n;
        int stepsToNewHead = n - k;
        
        
        ListNode newTail = current;
        for (int i = 0; i < stepsToNewHead; i++) {
            newTail = newTail.next;
        }
        
        
        ListNode newHead = newTail.next;
        newTail.next = null;
        
        return newHead;
    }
}