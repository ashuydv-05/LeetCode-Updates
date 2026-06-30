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
    public static ListNode reverse(ListNode head){
        //base case 
        if(head == null || head.next == null) return head;
        ListNode a = head.next;
        head.next = null;
        ListNode b = reverse(a);
        a.next = head;
        return b ;

    }
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> ll = new ArrayList<>();
        while(temp != null){
            ll.add(temp.val);
            temp = temp.next;
        }
        //2 pointer approach;
        int i =0;
        int j = ll.size() -1;
        while(i<=j){
            if(ll.get(i) != ll.get(j)){
                return false;
            }
            i++;
            j--;

        }
        return true;
    }
}

    //PALINDROME COPY KE SATH.. 
    //  if(head == null || head.next == null ) return true;
    //     //Creating copy node
         
    //     ListNode copynode = new ListNode(head.val);
    //     ListNode temp1 = head.next;
    //     ListNode temp2 = copynode;
       
    //     temp2.next = new ListNode(temp1.val);
    //     while(temp1 != null){
    //         temp2.next = new ListNode(temp1.val);
    //         temp1 = temp1.next;
    //         temp2 = temp2.next;
    //     }
    //     //reversing copynode
    //     copynode = reverse(copynode);
    //     //comparision
    //     while( head != null && copynode != null){
    //         if(head.val != copynode.val ){
    //             return false;
    //         }
    //         head = head.next;
    //         copynode = copynode.next;
    //     }
    //     return true;

    //     }