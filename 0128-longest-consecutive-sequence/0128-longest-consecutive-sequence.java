class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int num:set){ 
            if(!set.contains(num-1)){
                int current=num;
                int length=1;
                while(set.contains(current +1)){
                    current++;
                    length++;
                }
                    cnt=Math.max(cnt, length);
                }
            }
        return cnt;
    }
}