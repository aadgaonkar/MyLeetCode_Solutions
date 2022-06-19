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
        //iterative method.
        /*The most important thing is storing the next value.
		While iterating through the list we need to 
		keep storing all values as the reference sometimes gets lost*/
        ListNode curr=head;//this is our current node
        ListNode prev=null;// to store previous nodes
        while(curr!=null){
            ListNode temp=curr.next;// to store the next node
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}
