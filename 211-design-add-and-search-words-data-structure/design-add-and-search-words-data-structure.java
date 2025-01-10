class Trie{
    Trie child[];
    boolean word;

    Trie(){
        child = new Trie[26];
        word = false;
    }
}

class WordDictionary {
    Trie root;
    public WordDictionary() {
        root = new Trie();
    }
    
    public void addWord(String word) {
        Trie temp = root;
        for(int i=0; i<word.length(); i++){
            if(temp.child[word.charAt(i)-'a']==null){
                temp.child[word.charAt(i)-'a'] = new Trie();
            }
            temp = temp.child[word.charAt(i)-'a'];
        }
        temp.word = true;
    }
    
    public boolean search(String word) {
        return search(word,root,0);
    }
    public boolean search(String word,Trie node, int i) {
        if(i==word.length()) return node.word;
        else if(word.charAt(i)!='.'){
            if(node.child[word.charAt(i)-'a']==null) return false;
            return search(word,node.child[word.charAt(i)-'a'],i+1);
        }else{
            boolean res = false;
            for(int x=0; x<26; x++){
                if(node.child[x]!=null) res = res||search(word,node.child[x],i+1);
            }
            return res;
        }
    }
}