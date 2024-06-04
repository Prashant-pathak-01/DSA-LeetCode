class Solution {
    public int minimumSum(int n, int k) {
        Set<Integer> set = new HashSet<>();
        int res= 0;
        int count = 0;
        for(int i=1; count!=n; i++){
            if(!set.contains(i)){
                res+=i;
                count++;
            }
            set.add(k-i);
        }
        return res;
    }
}