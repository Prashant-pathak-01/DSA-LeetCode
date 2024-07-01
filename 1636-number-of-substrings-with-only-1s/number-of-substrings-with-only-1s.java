class Solution {
    int MOD = (int)1e9+7;
    public long getCount(int count){
        if(count == 0) return 0;
        if(count == 1) return 1;
        return (count+getCount(count-1))%MOD;
    }
    public int numSub(String s) {
        long res=0 ;
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='0'){
                res=(res+getCount(count))%MOD;
                count = 0;
            }
            else count++;
        }
        res=(res+getCount(count))%MOD;
        return (int)res;
    }
}