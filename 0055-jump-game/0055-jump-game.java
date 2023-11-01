class Solution {
    public boolean canJump(int[] nums) {
        int reachable = 0;
        for(int i = 0;i<nums.length;i++) {
            if (i>reachable) {
                return false;
            }
            reachable = Math.max(i+nums[i], reachable);
        }
        return true;
    }
}