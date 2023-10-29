class Solution {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        int sum = Arrays.stream(nums).sum();
        int nSum = size*(size+1)/2;
        return nSum-sum;
    }
}