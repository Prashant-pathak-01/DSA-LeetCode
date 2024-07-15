class Solution {
    public boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2; i<=Math.sqrt(n); i++) if(n%i==0) return false;
        return true;
    }
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> list = new ArrayList<>();
        if(n%2==1){
            if(isPrime(n-2)) list.add(new ArrayList<>(Arrays.asList(2,n-2)));
            return list;
        }
        for(int i=2; i<=n/2; i++){
            if(isPrime(i) && isPrime(n-i)){
                list.add(new ArrayList<>(Arrays.asList(i,n-i)));
            } 
        }
        return list;
    }
}