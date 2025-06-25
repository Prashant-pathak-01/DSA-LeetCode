class Solution {
    public long hcf(long a, long b) {
        while(b != 0) {
            long temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public long lcm(long a, long b) {
    return (a*b)/hcf(a,b);
    }
    public long maxScore(int[] nums) {
        long hcfPre[]= new long[nums.length];
        long prev =nums[0];
        for(int i=0; i<nums.length; i++){
            hcfPre[i] = hcf(nums[i],prev);
            prev = hcfPre[i];
        }
        long hcfPost[]= new long[nums.length];
        prev =nums[nums.length-1];
        for(int i=nums.length-1; i>=0; i--){
            hcfPost[i] = hcf(nums[i],prev);
            prev = hcfPost[i];
        }
        long lcmPre[]= new long[nums.length];
        prev =1;
        for(int i=0; i<nums.length; i++){
            lcmPre[i] = lcm(nums[i],prev);
            prev = lcmPre[i];
        }
        long lcmPost[]= new long[nums.length];
        prev =1;
        for(int i=nums.length-1; i>=0; i--){
            lcmPost[i] = lcm(nums[i],prev);
            prev = lcmPost[i];
        }
        // System.out.println(Arrays.toString(hcfPre));
        long res =lcmPost[0]*hcfPost[0];
        for(int i=0; i<nums.length; i++){
            long lcm = lcm(i>0?lcmPre[i-1]:1,i<nums.length-1?lcmPost[i+1]:1);
            long hcf = nums.length==1?nums[i]:(i>0 && i<nums.length-1)?hcf(hcfPre[i-1],hcfPost[i+1]):i==0?hcfPost[i+1]:hcfPre[i-1];
            //System.out.println(lcm+" "+hcf);
            res = Math.max(res,hcf*lcm);
        }

        return res;
    }
}