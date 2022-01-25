/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // HashSet Solution
//         if (head == null)
//             return false;
        
//         HashSet<ListNode> set = new HashSet<ListNode>();
//         while (head != null) {
//             if (!set.contains(head)) {
//                 set.add(head);
//                 head = head.next;
//             }
//             else 
//                 return true;
//         }
//         return false;
        
        // Fast and Slow Pointers Method
        ListNode slow = head;
        ListNode fast = head;
        
        if (head == null)
            return false;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast)
                return true;
        }
        return false;
    }
}