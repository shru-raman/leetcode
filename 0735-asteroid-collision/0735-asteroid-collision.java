class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk = new Stack<>();
        for(int num : asteroids) {
            if(num>=0 || stk.isEmpty()){
                stk.push(num);
            } else {
                if(stk.peek()<0){
                    stk.push(num);
                    continue;
                }
                int abs = Math.abs(num);
                if(abs < stk.peek()) {
                    continue;
                }
                if(stk.peek() == abs) {
                    stk.pop();
                    continue;
                }
                while(!stk.isEmpty() && stk.peek()>0 && stk.peek() <abs) {
                    stk.pop();
                }
                if(stk.isEmpty() || stk.peek()<0) {
                    stk.push(num);
                } else if(stk.peek() == abs) {
                     stk.pop();
                } 
            }
        }
        int[] result = new int[stk.size()];
        for(int i = stk.size()-1;i>=0;i--) {
            result[i] = stk.pop();
        }
        return result;
    }
}