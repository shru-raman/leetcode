class Solution {
    public String reverseVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        char[] arr = s.toCharArray();
        for(Character c : arr) {
            if(isVowel(c)){
                vowels.add(c);
            }
        }
        for(int i=0;i<arr.length;i++) {
            if(isVowel(arr[i])){
                int listSize = vowels.size();
                arr[i] = vowels.get(listSize-1);
                vowels.remove(listSize-1);
            }
        }
        return String.valueOf(arr);
    }

    private boolean isVowel(Character c) {
        return c=='a'|| c=='e' || c=='i' || c=='o' || c=='u' || c=='A'|| c=='E' || c=='I' || c=='O' || c=='U';
    }
}