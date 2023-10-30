class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        char[] carr = magazine.toCharArray();
        for(char c : carr){
            arr[c-'a']++;
        }
        char[] rarr = ransomNote.toCharArray();
        for(char r : rarr){
            arr[r-'a']--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]<0){
                return false;
            }
        }
        return true;
    }
}