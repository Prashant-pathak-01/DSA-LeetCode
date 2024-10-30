class Solution {
    class Pair{
        long data;
        long count;
        Pair(long d, long c){
            data = d;
            count = c;
        }
    }
    public long maximumSumOfHeights(List<Integer> maxHeights) {
        long left[] = new long[maxHeights.size()];
        long right[] = new long[maxHeights.size()];
        Stack<Pair> stack = new Stack<>();
        long sum =0;
        for(int i:maxHeights) sum+=i;
        long res =0;
        for(int i=0; i<left.length; i++){
            long count = 1;
            while(!stack.isEmpty() && stack.peek().data>maxHeights.get(i)){
                Pair temp = stack.pop();
                res+=Math.abs(temp.data-maxHeights.get(i))*temp.count;
                count+=temp.count;
            }
            Pair newPair = new Pair(maxHeights.get(i),count);
            stack.push(newPair);
            left[i] = res;
        }
        stack.clear();
        res = 0;
        for(int i=right.length-1; i>=0; i--){
            long count = 1;
            while(!stack.isEmpty() && stack.peek().data>maxHeights.get(i)){
                Pair temp = stack.pop();
                res+=Math.abs(temp.data-maxHeights.get(i))*temp.count;
                count+=temp.count;
            }
            stack.push(new Pair(maxHeights.get(i),count));
            right[i] = res;
        }
        long ans = 0;
        for(int i=0; i<left.length; i++){
            ans = Math.max(ans,sum-left[i]-right[i]);
        }
        return ans;
    }
}