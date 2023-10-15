class Trie {

    Set<TrieNode> set = new HashSet<>();
    TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode cur = root;
        char[] warr = word.toCharArray();
        for(char c : warr) {
            if(cur.children[c-'a']==null) {
                TrieNode node = new TrieNode(c);
                cur.children[c-'a'] = node;
            }
            cur = cur.children[c-'a'];
        }
        cur.isWord = true;
    }
    
    public boolean search(String word) {
        char[] warr = word.toCharArray();
        TrieNode cur = root;
        for(char c : warr) {
            if(cur.children[c-'a']==null){
                return false;
            }
            cur = cur.children[c-'a'];
        }
        return cur.isWord;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode cur = root;
        char[] warr = prefix.toCharArray();
        for(char c : warr){
            if(cur.children[c-'a']==null){
                return false;
            }
            cur = cur.children[c-'a'];
        }
        return true;
    }
}

public class TrieNode {
    char c;
    boolean isWord;
    TrieNode[] children = new TrieNode[26];
    public TrieNode(Character c) {
        this.c = c;
    }
    public TrieNode(){

    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */