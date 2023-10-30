class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();
        int i = 0, j = 0;
        int maxLen = 0;
        while(j<arr.length){
            if(!set.contains(arr[j])){
                set.add(arr[j]);
                maxLen = Math.max(maxLen, j-i+1);
                 j++;
            } else {
                while(set.contains(arr[j])){
                    set.remove(arr[i]);
                    i++;
                }
            }
        }
        return maxLen;
    }
}