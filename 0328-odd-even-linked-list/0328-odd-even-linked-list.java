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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp1 = head;
        ListNode temp2 = head.next;
        ListNode temp3 = head.next;
        ListNode dummy = new ListNode(1);
        dummy.next = head;
        while(temp2 != null && temp2.next != null){
            //odd
            temp1.next = temp2.next;            
            temp1 = temp1.next;
            temp2.next = temp1.next;
            temp2= temp2.next;
        }
        //connection 
         temp1.next = temp3;
        return dummy.next;

        
        
    }
}