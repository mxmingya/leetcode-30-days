class Trie {
    private class TrieNode {
        char val;
        boolean isWord;
        TrieNode[] children;
        
        public TrieNode(char val) {
            this.val = val;
            this.isWord = false;
            this.children = new TrieNode[26];
        }
    }
    /** Initialize your data structure here. */
    TrieNode root;
    public Trie() {
        root = new TrieNode(' ');
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode cur = root;
        char[] chars = word.toCharArray();
        for (char c : chars) {
            int index = c - 'a';
            if (cur.children[index] == null) {
                cur.children[index] = new TrieNode(c);
            }
            cur = cur.children[index];
        }
        cur.isWord = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        char[] cs = word.toCharArray();
        TrieNode cur = root;
        
        for (char c : cs) {
            if (cur.children[c-'a'] == null) return false;    
            cur = cur.children[c-'a'];
        }
        return cur.isWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode cur = root;
        char[] chars = prefix.toCharArray();
        for (char c : chars) {
            if (cur.children[c-'a'] == null) {
                return false;
            } 
            cur = cur.children[c-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
