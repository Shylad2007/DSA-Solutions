class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        
        ListNode odd=null, even=null, oddtemp=odd, eventemp=even, temp=head;
        int i=1;

        while(temp!=null) {
            if(i%2==0) {
                if(even==null) {
                    even=temp;
                    eventemp=even;
                }
                else {
                    eventemp.next=temp;
                    eventemp=eventemp.next;
                }
            }
            else {
                if(odd==null) {
                    odd=temp;
                    oddtemp=odd;
                }
                else {
                    oddtemp.next=temp;
                    oddtemp=oddtemp.next;
                }
            }

            temp=temp.next;
            i++;
        }
        
        oddtemp.next=even;
        eventemp.next=null;

        return odd;
    }
}