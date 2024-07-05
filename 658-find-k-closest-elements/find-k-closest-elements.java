class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list  = new ArrayList<>();
        PriorityQueue<int []> pq=  new PriorityQueue<>((a,b)->a[0]!=b[0]?a[0]-b[0]:a[1]-b[1]);
        for(int i=0; i<arr.length; i++){
            pq.add(new int[]{Math.abs(arr[i]-x),arr[i]});
        }
        for(int i=0; i<k; i++) list.add(pq.poll()[1]);
        Collections.sort(list);
        return list;
    }
}