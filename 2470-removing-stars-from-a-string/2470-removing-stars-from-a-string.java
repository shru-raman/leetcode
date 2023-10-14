class Solution {
    public String removeStars(String s) {
        Stack<Character> stk = new Stack<>();
        char[] arr = s.toCharArray();
        int i = 0,len = arr.length;
        while(i<len){
            while(i<len && arr[i]=='*') {
              stk.pop();
              i++;
            }
            if(i<len) {
                stk.push(arr[i]);
            }
            i++;
        }
        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()) {
            sb.append(stk.pop());
        }
        return sb.reverse().toString();
    }
}