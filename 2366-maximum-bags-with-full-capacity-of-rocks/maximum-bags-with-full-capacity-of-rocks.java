class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int arr[]  = new int[capacity.length];
        for(int i=0; i<capacity.length; i++){
            arr[i] = capacity[i]-rocks[i];
        }

        Arrays.sort(arr);
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(additionalRocks<arr[i]){
                break;
            }
            additionalRocks-=arr[i];
                count++;
        }
        return count;
        
    }
}