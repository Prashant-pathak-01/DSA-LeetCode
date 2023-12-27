class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int temp = 0;
        int res =0;
        int j = 0;
        for(int i=0; i<s.length(); i++){
                temp+=(int)Math.abs(s.charAt(i)-t.charAt(i));
                while(temp>maxCost){
                    temp-=(int)Math.abs(s.charAt(j)-t.charAt(j));
                    j++;
                }
            res = Math.max(res,i-j+1);
        }
        return res;

    }
}