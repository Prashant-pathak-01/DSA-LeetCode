class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int res = 0;
        Arrays.sort(tokens);
        int i = 0, j = tokens.length-1;
        int score = 0;
        while(i <= j) {
            if(power >= tokens[i]) {
                power -= tokens[i++];
                score++;
                res = Math.max(res, score);
            }
            else if(score >= 1) {
                power += tokens[j--];
                score--;
            }
            else break;
        } 
        return res;
    }
}