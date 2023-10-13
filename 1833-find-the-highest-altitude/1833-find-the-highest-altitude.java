class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int prevSum = 0;
        for(int num : gain) {
            prevSum = prevSum + num;
            max = Math.max(prevSum, max);
        }
        return max;
    }
}