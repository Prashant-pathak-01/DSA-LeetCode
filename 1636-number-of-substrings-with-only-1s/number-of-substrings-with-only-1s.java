class Solution {
    int MOD = (int)1e9+7;
    public long getCount(int count){
        long res =0 ;
        for(int i=1; i<=count; i++) res+=i;
        return res%MOD;
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