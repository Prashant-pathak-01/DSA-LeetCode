class Solution {
    public boolean isPal(String s,int i, int j, int dp[][]){
        if(i>j) return true;
        if(dp[i][j]!=0) return dp[i][j]==1;
        if(s.charAt(i)!=s.charAt(j)) {
            dp[i][j] = -1;
            return false;
        }else{
            dp[i][j] = isPal(s,i+1,j-1,dp)?1:-1;
            return dp[i][j] ==1;
        }
        
    }
    public boolean generate(String s,int c, int indx, int partionDP[][], int palnDP[][]){
        if(s.length()<=indx) return false;
        if(partionDP[indx][c]!=0) return partionDP[indx][c]==1;
        if(c==2){
            return isPal(s,indx,s.length()-1,palnDP);
        }
        boolean res = false;
        for(int i=indx; i<s.length(); i++){
            if(isPal(s,indx,i,palnDP)){
                res = res ||generate(s,c+1,i+1,partionDP,palnDP);
                if(res) return res;
            }
        }
        partionDP[indx][c]=res?1:-1;
        return res;
    }
    public boolean checkPartitioning(String s) {
        int partionDP[][] = new int[s.length()][3];
        int palnDP[][] = new int[s.length()][s.length()];
        return generate(s,0,0,partionDP,palnDP);
    }
}