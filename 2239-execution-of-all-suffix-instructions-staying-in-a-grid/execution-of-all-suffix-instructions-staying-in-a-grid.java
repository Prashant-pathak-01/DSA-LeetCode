class Solution {
    public int getMaxMoves(int n, int r, int c, String str,int i,int posMoves){
        if(r>=n || c>=n || r<0 || c<0) return posMoves-1;
        if(i>=str.length()) return posMoves;
        int res = 0;
        if(str.charAt(i)=='L') res = getMaxMoves(n,r,c-1,str,i+1,posMoves+1);
        else if(str.charAt(i)=='R') res = getMaxMoves(n,r,c+1,str,i+1,posMoves+1);
        else if(str.charAt(i)=='U') res = getMaxMoves(n,r-1,c,str,i+1,posMoves+1);
        else res = getMaxMoves(n,r+1,c,str,i+1,posMoves+1);
        return res;
    }
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int res[]=new int[s.length()];
        for(int i=0; i<s.length(); i++){
            res[i] = getMaxMoves(n,startPos[0],startPos[1],s.substring(i),0,0);
        } 
        return res;
    }
}