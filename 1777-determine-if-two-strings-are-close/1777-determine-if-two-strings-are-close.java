class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        if(word1.length()!=word2.length()){
            return false;
        }
        int len = word1.length();
        for(int i = 0;i<len;i++) {
            arr1[word1.charAt(i)-'a']++;
            arr2[word2.charAt(i)-'a']++;
        }

        for(int i = 0;i<26;i++) {
            if(arr1[i]==0 && arr2[i]>0) {
                return false;
            }
            if(arr2[i]==0 && arr1[i]>0) {
                return false;
            }
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }


    //     public boolean closeStrings(String word1, String word2) {
    //     char[] arr1 = word1.toCharArray();
    //     char[] arr2 = word2.toCharArray();
    //     if(arr1.length!=arr2.length) {
    //         return false;
    //     }
    //     Set<Character> set1 = new HashSet<>();
    //     Set<Character> set2 = new HashSet<>();

    //     for(int i = 0;i<arr1.length;i++) {
    //         set1.add(arr1[i]);
    //         set2.add(arr2[i]);
    //     }

    //     if(set1.size() != set2.size()) {
    //         return false;
    //     }

    //     for(Character c : set1) {
    //         if(!set2.contains(c)) {
    //             return false;
    //         }
    //     }

    //     Map<Character, Integer> map1 = new TreeMap<>();
    //     Map<Character, Integer> map2 = new TreeMap<>();
    //     for(int i = 0;i<arr1.length;i++) {
    //         map1.put(arr1[i], map1.getOrDefault(arr1[i],0)+1);
    //         map2.put(arr2[i], map2.getOrDefault(arr2[i],0)+1);
    //     }

    //     List<Integer> list1 = new ArrayList<>();
    //     List<Integer> list2 = new ArrayList<>();
    //     for(Integer val : map1.values()) {
    //         list1.add(val);
    //     }
    //     for(Integer val : map2.values()) {
    //         list2.add(val);
    //     }
       
    //     Collections.sort(list1);
    //     Collections.sort(list2);
    //     for(int i =0 ;i<list1.size();i++){
            
    //         if(list1.get(i).intValue()!=list2.get(i).intValue()){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
}