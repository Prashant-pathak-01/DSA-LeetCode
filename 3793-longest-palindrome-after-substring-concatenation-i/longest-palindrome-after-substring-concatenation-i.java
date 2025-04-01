class Solution {
    public boolean isPal(String str1, int i, int j, String str2, int k, int l){
        String finalString = str1.substring(i,j)+str2.substring(k,l);
        int x = 0;
        int y = finalString.length()-1;
        while(x<y){
            if(finalString.charAt(x)!=finalString.charAt(y)) return false;
            x++;
            y--;
        }
        return true;
    }
    public int longestPalindrome(String s, String t) {
        int res= 1;
        for(int i=0; i<=s.length(); i++){
            for(int j=i;j<=s.length(); j++){
                for(int k=0; k<=t.length(); k++){
                    for(int l=k; l<=t.length(); l++){
                        if(isPal(s,i,j,t,k,l)) res = Math.max(res,j-i+l-k);
                    }
                }
            }
        }
        return res;
    }
}