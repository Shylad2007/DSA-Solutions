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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null)
            return head;

        ListNode head1=null,head2=null,tail1=null,tail2=null;
        ListNode temp=head;

        while(temp!=null) {
            if(temp.val<x) {
                if(head1==null) {
                    head1=temp;
                    tail1=temp;
                }
                else {
                    tail1.next=temp;
                    tail1=temp;        
                }
            }
            else if(temp.val>=x) {
                if(head2==null) {
                    head2=temp;
                    tail2=temp;
                }
                else {
                    tail2.next=temp;
                    tail2=temp;    
                }
            }
            temp=temp.next;
        }
        
        if(tail1!=null)
            tail1.next=null;
        if(tail2!=null)
            tail2.next=null;

        if(tail1!=null)
            tail1.next=head2;
        else
            return head2;

        return head1;
    }
}