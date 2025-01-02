class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int pre[] = new int[words.length];
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        for(int i=0; i<words.length; i++){
            boolean isValid = set.contains(words[i].charAt(0)) && set.contains(words[i].charAt(words[i].length()-1));
            pre[i] = isValid?1:0;
            if(i>0) pre[i]+=pre[i-1];
        }
        int res[]= new int[queries.length];
        for(int i=0; i<queries.length; i++){
            res[i] = pre[queries[i][1]];
            if(queries[i][0]-1>=0) res[i]-=pre[queries[i][0]-1];
        }
        return res;
    }
}