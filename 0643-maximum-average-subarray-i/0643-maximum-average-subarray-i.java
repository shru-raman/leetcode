class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start = 0, end = k;
        int sum = 0;
        for(int i=0;i<k;i++){
            sum = sum + nums[i];
        }
        double maxAvg = (double) sum / k; //0.5
        for(int i=1;i+k<=nums.length;i++) {
            sum = sum - nums[i-1]; //2-1=1
            sum = sum + nums[i+k-1]; //1+50=51
            maxAvg = Math.max(maxAvg, (double)sum / k);
        }
        return maxAvg;
    }
}