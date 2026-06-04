class Solution {
    public List<Integer> getRow(int rowIndex) {
         List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } 
                else {
                    int val = result.get(i - 1).get(j - 1) 
                            + result.get(i - 1).get(j);

                    row.add(val);
                }
            }

            result.add(row);
        }

        return result.get(rowIndex);
    
    }
}


class Solution {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int p = x % 10;


            if (rev > Integer.MAX_VALUE / 10 || 
               (rev == Integer.MAX_VALUE / 10 && p > 7))
                return 0;

            if (rev < Integer.MIN_VALUE / 10 || 
               (rev == Integer.MIN_VALUE / 10 && p < -8))
                return 0;

            rev = rev * 10 + p;
            x /= 10;
        }

        return rev;
    }
}


class Solution {
    public int findDuplicate(int[] nums) {
        int s=nums[0];
        int f=nums[0];
        do { 
        s=nums[s];
        f=nums[nums[f]];
        }
        while(s != f);
        f=nums[0];
        while(s != f){
        s=nums[s];
        f=nums[f];

        }
        return s;
    }
}
