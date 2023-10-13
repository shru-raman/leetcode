class Solution {
    public int longestSubarray(int[] nums) {
        int start = 0, end = 0;
        int len = nums.length;
        int zcnt = 0;
        int max = 0;
        boolean isAllOne = true;
        for(int num : nums) {
            if(num==0) {
                isAllOne = false;
                break;
            }
        }
        if(isAllOne) {
            return len-1;
        }
        while(end < len) {
            if(nums[end] == 0 && zcnt==1) {
                while(nums[start]==1){
                    start++;
                }
                start++;
                zcnt--;
            }
            if(nums[end]==0 && zcnt<1) {
                zcnt++; 
            }
            if(nums[end]==1) {
                if(zcnt==1){
                     max = Math.max(max, end-start);
                } else {
                     max = Math.max(max, end-start+1);
                }
            }
            end++;
        }
        return max;
    }
}