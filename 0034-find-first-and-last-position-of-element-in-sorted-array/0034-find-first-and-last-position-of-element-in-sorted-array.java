class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                int left = mid;
                int right = mid;
                while(left>=0 && nums[left]==target){
                    left --;
                }
                while(right<nums.length && nums[right]==target){
                    right++;
                }
                return new int[] {left+1, right-1};
            } else if(target<nums[mid]){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}