class Solution {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        int[] leftSum = new int[len];
        int[] rightSum = new int[len];
        int l =1, r = len-2;
        leftSum[0] = nums[0];
        rightSum[len-1] = nums[len-1];
        while(l<len && r >=0) {
            leftSum[l] = leftSum[l-1] + nums[l];
            rightSum[r] = rightSum[r+1] + nums[r];
            l++;r--;
        }
        for(int i=0;i<len;i++){
            if(leftSum[i]==rightSum[i]) {
                return i;
            }
        }
        return -1;
    }
}