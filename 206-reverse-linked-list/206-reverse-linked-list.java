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
    public ListNode reverseList(ListNode head) {
        ListNode currptr = head;
        ListNode prevptr = null;
        ListNode nextptr = null;
        
        while (currptr != null) {
            nextptr = currptr.next;
            currptr.next = prevptr;
            
            prevptr = currptr;
            currptr = nextptr;
        }
        return prevptr;
    }
}