class Solution {
    
    public int differenceOfSums(int n, int m) {
        int total = (n*(n+1))/2;
        int sum =0;
        for(int i=m; i<=n; i+=m) sum+=i;
        return total-(sum*2);
    }
}