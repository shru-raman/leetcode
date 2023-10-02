class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mi = m-1;
        int ni = n-1;
        int len = nums1.length;
        int i = len-1;
        //5,6,7,0,0,0
        //1,2,3
        //12
        while(ni>=0) {
            if(mi>=0 && nums1[mi]>nums2[ni]) {
               nums1[i--] = nums1[mi]; //5//4
               mi--;
            } else {
                nums1[i--] = nums2[ni];
                ni--;
            }
        }
    }
}