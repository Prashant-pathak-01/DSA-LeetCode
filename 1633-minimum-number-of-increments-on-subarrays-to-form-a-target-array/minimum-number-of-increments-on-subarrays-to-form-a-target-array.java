class Solution {
    public int minNumberOperations(int[] target) {
        int res =0;
        int count = 0;
        for(int i:target){
            if(i>=count){
                res+=(Math.abs(count-i));
                count = i;
            }
            count = Math.min(count,i);
        }
        return res;
    }
}