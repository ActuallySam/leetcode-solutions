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
        if (head == null)
            return false;
        
        HashSet<ListNode> set = new HashSet<ListNode>();
        while (head != null) {
            if (!set.contains(head)) {
                set.add(head);
                head = head.next;
            }
            else 
                return true;
        }
        return false;
    }
}