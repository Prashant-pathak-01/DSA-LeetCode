class Node{
    Node child[];
    boolean word;
    Node(){
        child = new Node[26];
        word = false;
    }
}

class Trie {
    Node root;
    public Trie() {
        root = new Node();
    }
    
    public void insert(String word) {
        Node temp = root;
        for(int i=0; i<word.length(); i++){
            if(temp.child[word.charAt(i)-'a']==null){
                temp.child[word.charAt(i)-'a']=new Node();
            }
            temp = temp.child[word.charAt(i)-'a'];
        }
        temp.word = true;
    }
    
    public boolean search(String word) {
        Node temp = root;
        for(int i=0; i<word.length(); i++){
            if(temp.child[word.charAt(i)-'a']==null) return false;
            else temp = temp.child[word.charAt(i)-'a'];
        }
        return temp.word;
    }
    
    public boolean startsWith(String prefix) {
        Node temp = root;
        for(int i=0; i<prefix.length(); i++){
            if(temp.child[prefix.charAt(i)-'a']==null) return false;
            else temp = temp.child[prefix.charAt(i)-'a'];
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