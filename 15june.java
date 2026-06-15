/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
         ListNode p1 = headA;
        ListNode p2 = headB;

        while (p1 != p2) {

            if (p1 == null) {
                p1 = headB;
            } else {
                p1 = p1.next;
            }

            if (p2 == null) {
                p2 = headA;
            } else {
                p2 = p2.next;
            }
        }

        return p1;
    }
}



class Solution {
    public int arrayPairSum(int[] nums) {
       Arrays.sort(nums);

       int sum = 0;
       for(int i=0;i<nums.length;i+=2){
        sum+=nums[i];
       } 
       return sum;
    }
}
