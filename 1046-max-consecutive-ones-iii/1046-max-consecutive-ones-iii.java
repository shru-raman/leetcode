class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0, end = 0;
        int zidx = -1;
        int max = 0;
        int len = nums.length;
        int zcnt = 0;
        while(end<len) {
            if(nums[end]==0){
                zcnt++;
            }
            if(zcnt>k) {
                if(nums[start]==0) {
                    zcnt--;
                }
                start++;
            }
            if(zcnt<=k) {
                max = Math.max(max, end-start+1);
            }
            end++;
        }
        return max;
    }
}