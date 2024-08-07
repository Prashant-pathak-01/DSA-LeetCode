class Solution {
    public boolean judgeCircle(String moves) {
        int i =0;
        int j= 0;
        for(int x=0; x<moves.length(); x++){
            if(moves.charAt(x)=='U') i++;
            else if(moves.charAt(x)=='D') i--;
            else if(moves.charAt(x)=='L') j++;
            else j--;
        }
        return i==0 && j==0;
    }
}