class Solution {
    public static int[] sieveOfEratosthenes(int limit) {
        int[] sieve = new int[limit+1];
        for (int i=0; i<=limit; i++) {
            sieve[i]=i;
        }
        for (int i=2; i*i<=limit; i++) {
            if (sieve[i] == i) {
                for (int j = i*i; j<=limit; j+=i) {
                    if (sieve[j]==j) {
                        sieve[j]=i;
                    }
                }
            }
        }
        return sieve;
    }
    public int minOperations(int[] nums) {
        int max = 0;
        for(int i:nums) max = Math.max(max,i);
        int[] seive= sieveOfEratosthenes(max);
        int res= 0;
        for(int i=nums.length-2; i>=0; i--){
            while(nums[i]>nums[i+1]) {
                int temp = nums[i]/seive[nums[i]];
                if(seive[nums[i]]==1 || seive[nums[i]]==nums[i]) return -1;
                    nums[i]/=temp;
                    res++;
            }
        }
        return res;
    }
}