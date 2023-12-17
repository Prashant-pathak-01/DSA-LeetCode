class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        int res =0;
        for(int i=0; i<suits.length; i++){
            int count = 0;
            for(int j=0; j<suits.length; j++){
                if(suits[i]==suits[j]) count++;
            }
            res = Math.max(res,count);
            if(res==5) return "Flush";
        }
        int sec = 0;
        for(int i=0; i<suits.length; i++){
            int count = 0;
            for(int j=0; j<suits.length; j++){
                if(ranks[i]==ranks[j]) count++;
            }
            sec = Math.max(sec,count);
            
        }
        if(sec>=3) return "Three of a Kind";
        if(sec==2) return "Pair";
        return "High Card";
    }
}