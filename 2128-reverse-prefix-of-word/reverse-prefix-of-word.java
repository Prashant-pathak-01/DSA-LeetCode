class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder res = new StringBuilder();
        boolean flag = true;
        for(int i=0; i<word.length(); i++){
            if(flag){
                if(word.charAt(i)==ch) {
                for(int j=i; j>=0; j--) res.append(word.charAt(j));
                    flag = false;
                }
            }else{
                res.append(word.charAt(i));
            }
        }
        if(flag) return word;
        return res.toString();
    }
}