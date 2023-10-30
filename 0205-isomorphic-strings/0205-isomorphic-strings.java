class Solution {
    public boolean isIsomorphic(String s, String t) {
       int i = 0;
        Map<Character,Character> map = new HashMap<Character,Character>();
        while(i<s.length()){
           if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))!=t.charAt(i)){
               return false;
           } else if (!map.containsKey(s.charAt(i))){
               if(map.containsValue(t.charAt(i))){
                   return false;
               }
               map.put(s.charAt(i),t.charAt(i));
           }
            i++;
       }
        return true;
    }
}