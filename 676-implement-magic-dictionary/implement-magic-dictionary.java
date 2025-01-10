class Trie{
    Trie child[];
    boolean word;
    Trie(){
        child = new Trie[26];
        word = false;
    }
}

class MagicDictionary {
    Trie root;
    public MagicDictionary() {
        root = new Trie();
    }
    
    public void buildDict(String[] dictionary) {
        for(String str:dictionary){
            Trie temp = root;
            for(int i=0; i<str.length(); i++){
                if(temp.child[str.charAt(i)-'a']==null){
                    temp.child[str.charAt(i)-'a'] = new Trie();
                }
                temp = temp.child[str.charAt(i)-'a'];
            }
            temp.word= true;
        }
    }
    
    public boolean search(String searchWord){
        return search(searchWord,0,false,root);
    }

    public boolean search(String str, int i, boolean flag, Trie node){
        if(i==str.length()) return flag && node.word;
        boolean res = false;
        if(node.child[str.charAt(i)-'a']!=null) res = res || search(str,i+1,flag,node.child[str.charAt(i)-'a']);
        if(!flag){
            for(int x=0; x<26; x++){
                if(node.child[x]!=null && node.child[x]!=node.child[str.charAt(i)-'a']) res = res || search(str,i+1,true,node.child[x]);
            }
        }

        return res;
    }

}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dictionary);
 * boolean param_2 = obj.search(searchWord);
 */