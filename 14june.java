class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int freq[]= new int[1001];

        for(int num : nums1){
            freq[num]++;
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int num : nums2){
            if(freq[num]>0){
                res.add(num);
                freq[num]--;
            }
        }
        int k=res.size();
        int result[]  = new int[k];
        for(int i=0;i<k;i++){
            result[i] = res.get(i);
        }
        return result;
    }
}

import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> seen = new HashSet<>();

        for(int num : nums1){
            seen.add(num);
        }

        ArrayList<Integer> res =new ArrayList<>();
        for(int num : nums2){
            if(seen.contains(num)){
                res.add(num);
                seen.remove(num);
            }
        }

        int ans[] = new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;
    }
}
