class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int res = 0;
        int count = 1;
        int n = colors.length;

        for (int i = 0; i < n-1; i++) {
            if (colors[i] != colors[i+1]) {
                count++;
            } else {
                if (count >= k) {
                    res += (count - k + 1);
                }
                count = 1;
            }
        }
        if (count >= k) {
            res += (count - k + 1);
        }
        count =1;
        for(int i=colors.length-1; i>=colors.length-k+2; i--){
            if(colors[i]==colors[i-1]) break;
            count++;   
        }
        int prev = colors[colors.length-1];
        for(int i=0; i<k-1; i++){
            if(colors[i]==prev) break;
            count++;
            prev = colors[i];
        }
        if (count >= k) {
            res += (count - k + 1);
        }
        return res;
    }
}