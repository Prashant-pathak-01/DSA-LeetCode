class Solution {
    public int[] closestDivisors(int num) {
        int res[] = new int[2];
        res[0] = -1;
        res[1] = -1;
        int diff = Integer.MAX_VALUE;
        num++;
        for(int i=1; i<=Math.sqrt(num+1); i++){
            if(i*(num/i)==num){
                if(diff>Math.abs(i-(num/i))){
                    diff = Math.abs(i-(num/i));
                    res[0] = i;
                    res[1] = num/i;
                }
            }
        }
        num++;
        for(int i=1; i<=Math.sqrt(num+2); i++){
            if(i*(num/i)==num){
                if(diff>Math.abs(i-(num/i))){
                    diff = Math.abs(i-(num/i));
                    res[0] = i;
                    res[1] = num/i;
                }
            }
        }
        return res;
    }
}