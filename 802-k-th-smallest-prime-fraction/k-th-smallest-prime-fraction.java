class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(a[0], b[0]));
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                double temp = (double) arr[i] / arr[j];
                double[] fraction = {temp, arr[i], arr[j]};
                pq.add(fraction);
            }
        }
        for (int i = 0; i < k - 1; i++) {
            pq.poll();
        }
        return new int[]{(int) pq.peek()[1], (int) pq.peek()[2]};
    }
}
