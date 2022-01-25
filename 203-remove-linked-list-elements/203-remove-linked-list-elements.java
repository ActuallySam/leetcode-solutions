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
    public ListNode removeElements(ListNode head, int val) {
        
        // Recursive Solution
        if(head == null) 
            return null;
        
        head.next = removeElements(head.next, val);
        
        return (head.val == val) ? head.next : head;
        
        // Iterative Solution
//         ListNode node = head;
        
//         if (head == null)
//             return head;
        
//         while (head != null && head.val == val) 
//             head = head.next;
        
//         while (node != null && node.next != null) {
//             if (node.next.val == val)
//                 node.next = node.next.next;
//             else
//                 node = node.next;
//         }
        
//         return head;
    }
}