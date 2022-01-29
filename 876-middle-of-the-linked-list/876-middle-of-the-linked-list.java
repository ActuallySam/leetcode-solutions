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
        ListNode temp = head;
        ListNode temp1 = head;
        ListNode even = head;
        ListNode odd = head;
        int count = 0;
        
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        
        for (int i=1; i<=count/2; i++) {
            temp1 = temp1.next;
        }
        
        return temp1;
        
        // if (count % 2 == 0) {
        //     for (int i=1; i<=count/2; i++) {
        //         even = even.next;
        //     }
        //     return even;
        // }
        // else {
        //     for (int i=1; i<=count/2; i++) {
        //         odd = odd.next;
        //     }
        //     return odd;
        // }  
    }
}