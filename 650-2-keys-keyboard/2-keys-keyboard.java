class Solution {
    public int minSteps(int n) {
        int res = 0;
        while(n%2==0){
            n/=2;
            res+=2;
        }
        while(n%3==0){
            n/=3;
            res+=3;
        }
        for(int i=5; i<=Math.sqrt(n); i+=2){
            while(n%i==0){
                res+=i;
                n/=i;
            }
        }
        if(n>1)res+=n;
        return res;
    }
}