class WordDictionary {

    TrieNode root ;
    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode node = root;
        char[] arr = word.toCharArray();
        for(char c : arr){
            if(node.map.containsKey(c)){
                node = node.map.get(c);
            }else{
                TrieNode newNode = new TrieNode();
                node.map.put(c,newNode);
                node = newNode;
            }
        }
        node.isWord=true;
    }
    public boolean search(String word){
        return searchIn(word,root);
    }
    
    public boolean searchIn(String word,TrieNode rt) {
        TrieNode node = rt;
        char[] arr = word.toCharArray();
        int i = 0;
        for(char c: arr){
            if(c=='.'){
                Set<Character> keys = node.map.keySet();
                for(char key : keys){
                    TrieNode chk = node.map.get(key);
                    boolean val = searchIn(word.substring(i+1),chk);
                    if(val==true){
                        return true;
                    }
                }
                return false;
            }
            if(node.map.containsKey(c)){
                node = node.map.get(c);
            }else{
                return false;
            }
            i++;
        }
        return node.isWord;
    }
    
    
class TrieNode{
    public char c;
    public boolean isWord;
    public Map<Character,TrieNode> map = new HashMap<>();
    public TrieNode(){
        
    }
}
}


/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */