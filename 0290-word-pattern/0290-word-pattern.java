class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] sarr = s.split(" ");
        if(pattern.length()!=sarr.length){
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        Set<String> setSoFar = new HashSet<>();
        for(int i = 0;i<sarr.length;i++){
            char c = pattern.charAt(i);
            String cur = sarr[i];
            if(map.containsKey(c) && !map.get(c).equals(cur)){
                return false;
            }
            if(!map.containsKey(c) && setSoFar.contains(cur)){
                return false;
            }
            map.put(c, cur);
            setSoFar.add(cur);
        }
        return true;
    }
}