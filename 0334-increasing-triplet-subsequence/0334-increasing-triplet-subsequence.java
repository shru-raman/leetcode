class Solution {
    public boolean increasingTriplet(int[] nums) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        int len = nums.length;
        for(int i=0;i<len;i++) {
            if(nums[i]<=a){
                a = nums[i];
            } else if(nums[i]<=b){
                b = nums[i];
            } else return true;
        }
        return false;
    }

}