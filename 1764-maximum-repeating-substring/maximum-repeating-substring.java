class Solution {
    public int maxRepeating(String sequence, String word) {
        int res =0;
        for(int i=0; i<sequence.length()-word.length()+1; i++){
            int temp = i;
            int count = 0;
            while(temp<sequence.length()-word.length()+1 && sequence.substring(temp,temp+word.length()).equals(word)) {
                count++;
                temp+=word.length();
            }
            res = Math.max(res,count);
        }
        return res;
    }
}