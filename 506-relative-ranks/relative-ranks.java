class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] res = new String[score.length];

        int arr[] = new int[score.length];


        for(int i=0; i<score.length; i++) {
            int temp = score.length;
            for(int j=0; j<score.length; j++) {
                if(score[i]>score[j]) temp--;
            }
            res[i] = Integer.toString(temp);
        }

        for(int i=0; i<res.length; i++) {
            if(Integer.parseInt(res[i])==1){
                res[i] = "Gold Medal";
            } else if(Integer.parseInt(res[i])==2){
                res[i] = "Silver Medal";
            } else if(Integer.parseInt(res[i])==3){
                res[i] = "Bronze Medal";
            }
        }

        return res;
    }
}