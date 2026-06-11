class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(-1);
        ListNode curr = dummyNode;
        int carry = 0;
        ListNode t1=l1;
        ListNode t2=l2;
        while(t1!=null || t2!=null){
            int sum=carry;
            if(t1 != null) sum=sum+t1.val;
            if(t2 != null) sum=sum+t2.val;
            ListNode newNode = new ListNode(sum%10);
            carry=sum/10;
            curr.next = newNode;
            curr=curr.next;
            if(t1 !=null) t1=t1.next;
            if(t2 !=null) t2=t2.next;
        }
        if(carry>0){
           ListNode newNode = new ListNode(carry);
            curr.next=newNode;
        }
        return dummyNode.next;
    }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fast = head;
        ListNode slow = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        if (fast == null) {
            return head.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}

 
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1=list1;
        ListNode t2=list2;
        ListNode dNode =  new ListNode(-1);
        ListNode curr=dNode;
        while(t1!=null && t2!=null){
            if(t1.val < t2.val){
                curr.next=t1;
                curr=t1;
                t1=t1.next;
            }
            else {
                curr.next=t2;
                curr=t2;
                t2=t2.next;
            }
        }
        if(t1!=null)
        curr.next=t1;
        else 
        curr.next=t2;
        return dNode.next;
    }
   
}
