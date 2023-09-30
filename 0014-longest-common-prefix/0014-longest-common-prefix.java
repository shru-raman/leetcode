class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        char[] arr = strs[0].toCharArray();
        int curCommonIdx = arr.length;
        for(int i=1;i<strs.length;i++) {
            char[] cur = strs[i].toCharArray();
            int idx = 0;
            while(idx < curCommonIdx && idx<cur.length && idx<arr.length && arr[idx]==cur[idx]) {
                idx++;
            }
            if(idx==0) {
                return "";
            }
            curCommonIdx = idx;
        }
        result = strs[0].substring(0, curCommonIdx);
        return result;
    }
}