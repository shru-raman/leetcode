class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> stk = new Stack<>(); //0=index, 1=val
        int len = temperatures.length;
        int[] res = new int[len]; 
        int i = 0;
        while(i<len){
            while(!stk.isEmpty() &&  temperatures[i]>stk.peek()[1]) {
                res[stk.peek()[0]] = i - stk.peek()[0];
                stk.pop();
            }
            stk.push(new int[]{ i,temperatures[i]});
            i++;
        }
       return res;
    }
}