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
    public void reorderList(ListNode head) {
        ListNode mid = midNode(head);
        ListNode nextToMid = mid.next;
        mid.next = null;
        ListNode p2 = reverse(nextToMid);
        
        ListNode p1 = head, next = null;
        while (p1 != null || p2 != null) {
            next = p1.next;
            p1.next = p2;
            
            p1 = p2;
            p2 = next;
        }
    }
    
    public ListNode reverse (ListNode head) {
        ListNode next;
        ListNode curr = head;
        ListNode prev = null;
        
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    public ListNode midNode (ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    } 
}