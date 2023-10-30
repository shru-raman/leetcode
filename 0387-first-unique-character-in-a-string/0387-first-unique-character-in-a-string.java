class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Long> map = s.chars().mapToObj(x -> (char)x).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        int firstUniq = IntStream.range(0, s.length()).filter(i-> map.get(s.charAt(i))==1).findFirst().orElse(-1);

        return firstUniq;
    }
}