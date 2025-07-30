class Solution {
    public boolean isPrime(int num){
        if(num==1) return false;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public boolean checkPrimeFrequency(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        for(int key:map.keySet()){
            if(isPrime(map.get(key))) return true;
        }
        return false;
    }
}