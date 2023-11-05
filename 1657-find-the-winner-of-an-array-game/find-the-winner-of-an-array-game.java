class Solution {
    public int getWinner(int[] arr, int k) {
        int prev_winner = arr[0];
        int count = 0;
        Queue<Integer> list = new LinkedList<>();
        int max = arr[0];
        for(int i=1; i<arr.length; i++) {
            list.add(arr[i]);
            max = Math.max(max,arr[i]);
        }
        if(k>=arr.length) return max;
        for(int i=1; i>0; i++){
            if(prev_winner>=list.peek()){
                int temp = list.remove();
                list.add(temp);
                count++;
            } else{
                list.add(prev_winner);
                prev_winner = list.remove();
                count = 1;
            }
                if(count==k) return prev_winner;
        }
        return max;
    }
}