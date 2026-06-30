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
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode A = head;
        // ListNode B = head;
        
        for(int i = 0; i<k-1;i++){
            A = A.next;
        }
        ListNode fast = A;
        ListNode slow = head;
        // while(fast != null || fast.next != null){
        while( fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        // Swapping 
        int temp = A.val;
        A.val = slow.val;
        slow.val = temp;

        return head;
    }

}