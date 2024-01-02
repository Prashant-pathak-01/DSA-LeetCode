class Solution {
    public int calcOperations(String word1,String word2, int i, int j,int [][]dp){
        if(i==word1.length() && j==word2.length()) return 0;
        if(i>=word1.length()){
            return word2.length()-j;
        }
        if(j>=word2.length()){
            return word1.length()-i;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        if(word1.charAt(i)==word2.charAt(j)){
            dp[i][j] =  calcOperations(word1,word2,i+1,j+1,dp);
        }else{
            int a = 1+calcOperations(word1,word2,i+1,j,dp);
            int b = 1+calcOperations(word1,word2,i+1,j+1,dp);
            int c = 1+calcOperations(word1,word2,i,j+1,dp);
            dp[i][j] =  Math.min(a,Math.min(b,c));
        }
        return dp[i][j];
    }
    public int minDistance(String word1, String word2) {
        int dp[][] = new int[word1.length()][word2.length()];
        for(int i=0; i<word1.length(); i++){
            Arrays.fill(dp[i],-1);
        }
        return calcOperations(word1,word2,0,0,dp);

    }
}