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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
        return head;
        }
        int size =0;
        ListNode temp1 = head;
        while(temp1 != null){
            temp1 = temp1.next;
            size++;
        }
        if(k == 0) return head;
        if(k > size ) {
            k = k % size;
        }
        
        for(int i = 0;i < k ; i++){
            ListNode temp = head;
            ListNode prev = head;
            while(prev.next.next != null){
                prev = prev.next;
            }
            while(temp.next != null){
                temp= temp.next;
            }
            temp.next = head;
            prev.next = null;
            head = temp;

        }
        return head;
    }
}