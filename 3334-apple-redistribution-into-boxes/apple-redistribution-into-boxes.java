class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for(int i:apple) sum+=i;
        Arrays.sort(capacity);
        int temp = 0;
        int x=  0;
        for(int i=capacity.length-1; i>=0; i--){
            if(temp>=sum) return x;
            x++;
            temp+=capacity[i];
        }
        return x;
    }
}