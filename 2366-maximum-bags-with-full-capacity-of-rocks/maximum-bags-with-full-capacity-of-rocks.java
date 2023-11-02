class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        for(int i=0; i<capacity.length; i++){
            capacity[i] = capacity[i]-rocks[i];
        }

        Arrays.sort(capacity);
        int count = 0;
        for(int i=0; i<capacity.length; i++){
            if(additionalRocks<capacity[i]){
                break;
            }
            additionalRocks-=capacity[i];
                count++;
        }
        return count;
        
    }
}