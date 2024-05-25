class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        if(!set.contains(endWord)) return 0;
        set.remove(beginWord);
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        int res= 0;
        while(!q.isEmpty()){
            res++;
            int size = q.size();
            for(int i=0; i<size; i++){
                String str = q.poll();
                char arr[] = str.toCharArray();
                for(int j=0; j<str.length(); j++){
                    for(char x='a'; x<='z'; x++){
                        if(x==str.charAt(j)) continue;
                        arr[j] = x;
                        String temp = new String(arr);
                        if(temp.equals(endWord)) return res+1;
                        if(set.contains(temp)) {
                            q.add(temp);
                            set.remove(temp);
                        }
                    }
                    arr[j] = str.charAt(j);
                }
            }
        }
        return 0;
    }
}