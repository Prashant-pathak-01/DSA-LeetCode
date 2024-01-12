class Solution {
    public int maxPower(String s) {
        int res =1;
        for(int i=0; i<s.length()-1; i++){
            int temp = 1;
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)) {
                temp++;
                i++;
            }
            res = Math.max(temp,res);
        }
        return res;
    }
}