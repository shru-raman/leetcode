class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0, j = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        while(j<nums.length){
            sum = sum + nums[j];
            while(sum>=target) {
                minLen = Math.min(minLen, j-i+1);
                sum = sum - nums[i];
                i++;
            }
            j++;
        }
        return minLen==Integer.MAX_VALUE?0:minLen;
    }
}