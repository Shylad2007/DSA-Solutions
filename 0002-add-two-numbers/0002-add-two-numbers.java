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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum,carry=0;

        ListNode head=null,tail=null;
        ListNode temp1=l1,temp2=l2;

        while(temp1!=null || temp2!=null || carry!=0) {
            ListNode temp=new ListNode();

            if(temp1==null && temp2==null)
                sum=carry;
            else if(temp1==null)
                sum=temp2.val+carry;
            else if(temp2==null)
                sum=temp1.val+carry; 
            else
                sum=temp1.val+temp2.val+carry;

            if(sum>9) {
                carry=sum/10;
                sum%=10;
            }
            else
                carry=0;

            temp.val=sum;
            
            if(head==null) {
                head=temp;
                tail=temp;
            }
            else {
                tail.next=temp;
                tail=temp;
            }

            if(temp1==null && temp2==null)
                break;
            if(temp1==null)
                temp2=temp2.next;
            else if(temp2==null)
                temp1=temp1.next;
            else {
                temp1=temp1.next;
                temp2=temp2.next;
            }
        }

        return head;
    }
}