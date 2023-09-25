class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        char[] sarr = s.toCharArray();
        Stack<Character> stk = new Stack<>();

        for(char c : sarr) {
            if(map.containsKey(c)) {
                stk.add(c);
            } else if(!stk.isEmpty() && c == map.get(stk.peek())) {
                stk.pop();
            } else {
                return false;
            }
        }

        return stk.isEmpty();
    }
}