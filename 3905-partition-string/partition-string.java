class Solution {
    class Trie{
        boolean isWord;
        Trie arr[];
        Trie(){
            isWord = false;
            arr = new Trie[26];
        }

        public boolean isCompleteWord(String str){
            Trie temp = this;
            for(int i=0; i<str.length(); i++){
                if(temp.arr[str.charAt(i)-'a']==null){
                    temp.arr[str.charAt(i)-'a'] = new Trie();
                }
                temp = temp.arr[str.charAt(i)-'a'];
            }
            if(temp.isWord) return true;
            else{
                temp.isWord = true;
                return false;
            }
        }

    }
    public List<String> partitionString(String s) {
       Trie trie = new Trie();
       StringBuilder str = new StringBuilder();
       List<String> list = new ArrayList<>();
       for(int i=0; i<s.length(); i++){
            str.append(s.charAt(i));
            if(!trie.isCompleteWord(str.toString())){
                list.add(str.toString());
                str.setLength(0);
            }
       }

       if(!str.toString().equals("") && !trie.isCompleteWord(str.toString())){
            list.add(str.toString());
        }
        return list;
    }
}