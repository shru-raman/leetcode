class Solution {
    public void rotate(int[] nums, int k) {
        //1234567
        //7654321
        //7651234
        int i=0,j=nums.length-1;
        k = k%(nums.length);
        reverse(nums, i,j);
        reverse(nums, 0, k-1);
        reverse(nums, k, j);
    }

    private void reverse(int[] nums, int i, int j) {
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;j--;
        }
    }
}