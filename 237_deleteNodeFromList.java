/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // the head is not given so we cannot use a direct while condition to find the previous node.
        //since the previous node to the given node in unknown we cannot directly delete it
        //what we can do instead is delete the next node and copy its value to the given node.
        
       int v=node.next.val;//to store the next node's data
        node.next=node.next.next
        node.val=v;
        
    }
}
