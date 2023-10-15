class Solution {
    public String decodeString(String s) {
        //3
        //a
        //2
        //bc
        Stack<Character> stk = new Stack<>();
        char[] arr = s.toCharArray();
        int len = arr.length;
        int i = 0;
        while(i<len){
            if(arr[i]!=']'){
                stk.push(arr[i]);
            } else {
                StringBuilder sb = new StringBuilder();
                while(!stk.isEmpty() && stk.peek()!='['){
                    char c = stk.pop();
                    sb.append(c); //cb
                }
                stk.pop(); //pop the bracket
                sb = sb.reverse(); //bc
                char[] str = sb.toString().toCharArray();
                //pop the number
                StringBuilder num = new StringBuilder();
                while(!stk.isEmpty() && Character.isDigit(stk.peek())){
                    num.append(stk.pop());
                }
                int times = Integer.parseInt(num.reverse().toString());
                while(times-- >0) {
                    int strlen = str.length;
                    int si = 0;
                    while(si<strlen){
                        stk.push(str[si++]); //a //a //a 
                    } 
                }
            }
            i++;
        }
        char[] rarr = new char[stk.size()];
        int k = stk.size()-1;
        while(!stk.isEmpty()) {
            rarr[k--] = stk.pop();
        }
        return String.valueOf(rarr);
    }
}