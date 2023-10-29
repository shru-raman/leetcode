class Solution {
    public int maxProfit(int[] prices) {
        //7 1 5 3 6 4
        //7 1 1 1 1 1
        int minSoFar = Integer.MAX_VALUE;
        int maxSoFar = 0;
        for(int num : prices){
            minSoFar = Math.min(minSoFar, num); //7 //1 //1 //1 //1
            maxSoFar = Math.max(maxSoFar, num-minSoFar);//7-7=0 //1-1=0 //5-1=4 //3-1=2,4
            //6-1=5,4=5 //
        }
        return maxSoFar;
    }
}