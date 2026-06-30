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
            int size = size(head);
            int idx = size/2;
            // ListNode ans;
            ListNode temp = head;
            for(int i = 0; i <idx;i++){
                temp = temp.next;
            }
            return temp;
            

        
    }
    public static int  size(ListNode head){
        int size =0;
        ListNode temp1 = head;
        while(temp1 != null){
            temp1 = temp1.next;
            size++;
        }
        return size;
    }


    // another method , slow and fast pointer
}