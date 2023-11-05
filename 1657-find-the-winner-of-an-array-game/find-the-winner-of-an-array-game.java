class Solution {
    public int getWinner(int[] arr, int k) {
        int prev_winner = arr[0];
        int count = 0;
        int max = arr[0];
        for(int i=1; i<arr.length; i++) {
            max = Math.max(max,arr[i]);
        }
        if(k>=arr.length) return max;
        for(int i=1; i>0; i++){
            if(prev_winner>=arr[i]){
                count++;
            } else{
                prev_winner = arr[i];
                count = 1;
            }
                if(count==k || prev_winner==max) return prev_winner;
        }
        return max;
    }
}