class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int res= 0;
        for(int i=0; i<customers.length; i++) if(grumpy[i]==0) res+=customers[i];
        int max =0;
        for(int i=0; i<minutes; i++) if(grumpy[i]==1) max+=customers[i];
        int temp = max;
        for(int i=minutes; i<customers.length; i++){
            if(grumpy[i-minutes]==1) temp-=customers[i-minutes];
            if(grumpy[i]==1) temp+=customers[i];
            max = Math.max(max,temp);
        }
        return res+max;
    }
}