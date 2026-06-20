234. Palindrome Linked List

class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st =new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            st.push(temp.val);
            temp=temp.next;
        }
         temp=head;
        while(temp!=null){
            if(temp.val!=st.peek())
            return false;
            st.pop();
            temp=temp.next;
        }
        return true;
    }
}

class Solution {
    public boolean isPalindrome(ListNode head) {
            ListNode slow=head;
            ListNode fast=head;
            while(fast.next!=null && fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            ListNode newHead=reverse(slow.next);
            ListNode first=head;
            ListNode second=newHead;

            while(second!=null){
                if(first.val!=second.val){
                    reverse(newHead);
                    return false;
                }
                first=first.next;
                second=second.next;
            }
            reverse(newHead);
            return true;
    }
    public ListNode reverse(ListNode head){ 
    if(head==null || head.next==null){
        return head;
    }
    ListNode newHead=reverse(head.next);
    ListNode font=head.next;
    font.next=head;
    head.next=null;

    return newHead;
    }
}


class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }

        return result;

    }
}
