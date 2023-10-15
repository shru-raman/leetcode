class Solution {
    TrieNode root = new TrieNode();
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        //Sort so that it can get inserted in order
        Arrays.sort(products);
        //insert
        for(String pdt : products) {
            insert(pdt);
        }
        //Search for each char
        List<List<String>> result = prefixSearch(searchWord);
        return result;
    }

    private List<List<String>> prefixSearch(String searchWord) {
        List<List<String>> result = new ArrayList<>();
        char[] warr = searchWord.toCharArray();
        TrieNode cur = root;
        for(char c : warr) {
            if(cur.children[c-'a']==null){
                TrieNode node = new TrieNode();
                cur.children[c-'a'] = node;
            }
            result.add(cur.children[c-'a'].list);
            cur = cur.children[c-'a'];
        }
        return result;
    }
    private void insert(String pdt) {
        TrieNode cur = root;
        char[] warr = pdt.toCharArray();
        for(char c : warr) {
            if(cur.children[c-'a']==null) {
                TrieNode node = new TrieNode(c);
                cur.children[c-'a'] = node;
            }
            List<String> eligibleWords = cur.children[c-'a'].list;
            if(eligibleWords.size()<3){
                eligibleWords.add(pdt);
            }
            cur.children[c-'a'].list = eligibleWords;
            cur = cur.children[c-'a'];
        }
        cur.isWord = true;
    }
    
}

class TrieNode {
    char c;
    boolean isWord;
    TrieNode[] children = new TrieNode[26];
    List<String> list = new ArrayList<>();
    public TrieNode(char c){
        this.c = c;
    }
    public TrieNode() {

    }
}