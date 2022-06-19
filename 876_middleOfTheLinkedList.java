class Solution {
    public ListNode middleNode(ListNode head) {
        //brute force approach
        //simply finding the size and dividing by 2 to get the middle value
        int size=0;
        ListNode c=head;
        while(c!=null){
            c=c.next;
            size++;
        }
        if(size==0)
            return null;
        if(size==1)
            return head;
        ListNode curr=head;
        int mid=(size/2);
        for(int i=0;i<mid;i++){
            curr=curr.next;
        }return curr;
    }
}
