class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs) {
                char[] arr = str.toCharArray();
                char[] sarr = new char[26];
                for(char a : arr) {
                    sarr[a-'a']++;
                }
                String key = String.valueOf(sarr);
                List<String> list = map.getOrDefault(key, new ArrayList<>());
                list.add(str);
                map.put(key, list);
        }
        map.entrySet().forEach(entry -> {
            result.add(entry.getValue());
        });
        return result;
    }
}