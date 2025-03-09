class Solution {
    public int maximumGroups(int[] grades) {
        int req = 1;
        int res =0;
        int n = grades.length;
        while(n>=req){
            n-=req;
            req++;
            res++;
        }
        return res;
    }
}