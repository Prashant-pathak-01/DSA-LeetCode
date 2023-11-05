class Solution {
    public int getWinner(int[] arr, int k) {
        int prev_winner = arr[0];
        int count = 0;
        List<Integer> list = new ArrayList<>();
        int max = arr[0];
        for(int i=1; i<arr.length; i++) {
            list.add(arr[i]);
            max = Math.max(max,arr[i]);
        }
        if(k>=arr.length) return max;
        for(int i=1; i>0; i++){
            if(prev_winner>=list.get(0)){
                int temp = list.remove(0);
                list.add(temp);
                count++;
                if(count==k) return prev_winner;
            } else{
                list.add(prev_winner);
                prev_winner = list.remove(0);
                count = 1;
                if(count==k) return prev_winner;
            }
        }
        return max;
    }
}