class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int res =0;
        int time =0;
        for(int i=0; i<events.length; i++){
            if(i==0){
                time = events[i][1];
                res = events[i][0];
            }else{
                int temp = events[i][1]-events[i-1][1];
                if(temp>=time){
                    if(temp==time) res = Math.min(res,events[i][0]);
                    else{
                        time = temp;
                        res = events[i][0];
                    }
                }
            }
        }
        return res;

    }
}