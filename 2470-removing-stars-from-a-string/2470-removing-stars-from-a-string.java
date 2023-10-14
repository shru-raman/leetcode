class Solution {
    public String removeStars(String s) {
        Stack<Character> stk = new Stack<>();
        char[] arr = s.toCharArray();
        int i = 0,len = arr.length;
        while(i<len) {
            if(arr[i]=='*') {
              stk.pop();
            } else {
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