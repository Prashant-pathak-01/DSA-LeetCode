class Solution {
    public int minMoves(int target, int maxDoubles) {
        int res = 0;
        while(target>1){
            if(maxDoubles==0){
                res+=target-1;
                target = 1;
            }else{
                if(target%2==0) {
                    target/=2;
                    maxDoubles--;
                }else{
                    target--;
                }
                    res++;
            }
        }
        return res;
    }
}