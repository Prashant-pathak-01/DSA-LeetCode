class Solution {
    public int maximumGroups(int[] grades) {
        Arrays.sort(grades);
        int res= 0;
        int pSum =0;
        int pCount =0;
        int sum =0;
        int count =0;
        for(int i=0; i<grades.length; i++){
            if(sum>pSum && count>pCount){
                pSum = sum;
                sum =0;
                res++;
                pCount = count;
                count =0;
            }
            sum+=grades[i];
            count++;
        }
        if(sum>pSum && count>pCount) res++;
        return res;
    }
}