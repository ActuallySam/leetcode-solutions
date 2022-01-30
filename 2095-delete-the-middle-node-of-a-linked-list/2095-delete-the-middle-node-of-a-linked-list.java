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
    public ListNode deleteMiddle(ListNode head) {
        // Two Pointer Solution
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = head;
        if (head.next == null)
            return null;
        
        while (fast != null && fast.next != null) {
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        prev.next = slow.next;
        
        return head;
        
        // Brute Force Solution
//         ListNode temp = head;
//         ListNode temp1 = head;
//         int count = 0;
        
//         if (head.next == null)
//             return null;
        
//         while (temp != null) {
//             temp = temp.next;
//             count++;
//         }
        
//         for (int i=1; i<=(count/2)-1; i++) {
//             temp1 = temp1.next;
//         }
//         temp1.next = temp1.next.next;
        
//         return head;
    }
}