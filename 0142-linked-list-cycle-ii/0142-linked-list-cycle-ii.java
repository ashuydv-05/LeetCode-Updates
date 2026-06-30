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
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode p1 = head;
        ListNode temp = head;
        int count = 0;
        boolean ans = false;
        //check cyclic
        while( fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                ans = true;
                break;
            }
        }
        if(ans == true){
            //find the first node of the loop
            // while(true){
                while(p1 != slow){
                p1 = p1.next;
                slow = slow.next;
                }
            
            //getting index
            while(p1 != temp){
                count++;
                temp = temp.next;
            }
            System.out.println("tail connects to node index" + count);
            return p1;
        }

        else{
            System.out.println("no cycle");
            // return head;
            return null;
        }
        
    }
}