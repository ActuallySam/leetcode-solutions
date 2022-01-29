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
    public ListNode middleNode(ListNode head) {
        // Fast and Slow Pointer Solution
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
        
        // Brute Force Solution
//         ListNode temp = head;
//         ListNode temp1 = head;
//         int count = 0;
        
//         while (temp != null) {
//             temp = temp.next;
//             count++;
//         }
        
//         for (int i=1; i<=count/2; i++) {
//             temp1 = temp1.next;
//         }
        
//         return temp1;
    }
}