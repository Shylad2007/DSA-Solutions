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
        ListNode temp=head;
        int size=0;

        while(temp!=null) {
            size+=1;
            temp=temp.next;
        }

        if(size<=1) {
            return head;
        }

        k%=size;
        if(k==0) {
            return head;
        }
        temp=head;

        for(int i=0;i<size-k-1;i++)
            temp=temp.next;

        ListNode newHead=temp.next;
        temp.next=null;

        temp=newHead;
        while(temp.next!=null)
            temp=temp.next;

        temp.next=head;
        return newHead;
    }
}