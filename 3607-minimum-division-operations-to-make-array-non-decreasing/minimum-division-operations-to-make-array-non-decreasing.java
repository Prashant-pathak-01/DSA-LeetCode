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
        int[] seive= sieveOfEratosthenes((int)1e6);
        int res= 0;
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i]>nums[i+1]){
                if(seive[nums[i]]==1 || seive[nums[i]]==nums[i]){
                    return -1;
                }else{
                    int temp = nums[i]/seive[nums[i]];
                    while(nums[i]>nums[i+1]) {
                        if(seive[nums[i]]==1 || seive[nums[i]]==nums[i]){
                    return -1;
                }
                        nums[i]/=temp;
                        res++;
                        temp = nums[i]/seive[nums[i]];
                    }
                }
            }
        }
        return res;
    }
}