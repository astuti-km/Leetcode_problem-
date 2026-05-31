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


import java.util.Stack;
class Solution {
    
    public boolean isValid(String s) {
    Stack <Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){ 
                st.push(ch);
                }
                else  {
                    if(st.isEmpty()){ 
                    return false;
                }
                char chr=st.pop();
                if(ch==')' && chr!='('||
                ch=='}' && chr!='{'||
                ch==']' && chr!='['){
                    return false;
                }
                }
        }
        return st.isEmpty();
    }
}


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
