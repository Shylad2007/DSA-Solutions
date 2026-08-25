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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)
            return list2;
        else if(list2==null) 
            return list1;

        ListNode head=null,tail=null;

        ListNode temp1=list1,temp2=list2;
        ListNode node;

        while(temp1!=null && temp2!=null) {
            if(temp1.val>=temp2.val) {
                node=temp2;
                temp2=temp2.next;
            }
            else {
                node=temp1;
                temp1=temp1.next;
            }

            if(head==null) {
                head=node;
                tail=node;
            }
            else {
                tail.next=node;
                tail=node;
            }
        }

        while(temp1!=null) {
            tail.next=temp1;
            tail=temp1;
            temp1=temp1.next;
        }

        while(temp2!=null) {
            tail.next=temp2;
            tail=temp2;
            temp2=temp2.next;
        }
        return head;
    }
}