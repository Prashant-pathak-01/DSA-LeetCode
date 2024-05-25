class Solution {
    public boolean solve(String str,List<String> list,int dp[]){
        if(str.length()==0) return true;
        if(dp[str.length()]!=0) return dp[str.length()]==1?true:false;
        boolean res = false;
        for(int i=0; i<list.size(); i++){
            if(str.length()>=list.get(i).length() && str.substring(0,list.get(i).length()).equals(list.get(i))) res = res||solve(str.substring(list.get(i).length()),list,dp);
            if(res) return true; 
        }
        dp[str.length()]=res?1:-1;
        return res;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        int dp[] =  new int[s.length()+1];
        return solve(s,wordDict,dp);
    }
}