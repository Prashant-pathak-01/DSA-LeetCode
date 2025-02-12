class Solution {
    class Pair{
        int x;
        int y;
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public int getDigitSum(int num){
        int sum =0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        Map<Integer,Pair> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int digitSum =getDigitSum(nums[i]);
            Pair pair = map.getOrDefault(digitSum,new Pair(-1,-1));
            if(nums[i]>=pair.x){
                pair.y = pair.x;
                pair.x = nums[i];
            }else if(nums[i]>pair.y){
                pair.y = nums[i];
            }
            map.put(digitSum,pair);
        }
        int res =-1;
        for(int i:map.keySet()){
            Pair pair = map.get(i);
            if(pair.x!=-1 && pair.y!=-1){
                res =  Math.max(res,pair.x+pair.y);
            }
        }
        return res;
    }
}