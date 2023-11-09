class Solution {
    public int countHomogenous(String s) {
        int res = 0;
        char prev = s.charAt(0);
        int count= 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==prev){
                count++;
            } else{
                count = 1;
                prev = s.charAt(i);
            }
            res+=count;
            res%=(1e9+7);
        }
        return res;
    }
}