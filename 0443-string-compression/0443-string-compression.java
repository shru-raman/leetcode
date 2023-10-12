class Solution {
    public int compress(char[] chars) {
        int i = 0, j = 0, len = chars.length;
        StringBuilder sb = new StringBuilder();
        while(j<len || i<len) {
            while(j<len && chars[i]==chars[j]){
                j++;
            }
            sb.append(chars[i]);
            if(j-i>1) {
                sb.append(j-i);
            }
            i = j;
            j++;
        }
        String s = sb.toString();
        for(int k = 0;k<s.length();k++){
            chars[k] = s.charAt(k);
        }
        return s.length();
    }
}