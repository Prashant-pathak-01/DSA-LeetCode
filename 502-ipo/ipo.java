class Solution {
    public int findMaximizedCapital(int numProjects, int initial, int[] profits, int[] capital) {
        int index = 0;
        int total = profits.length;
        List<int[]> projects = new ArrayList<>();
        for (int i = 0; i < total; i++) {
            projects.add(new int[]{capital[i], profits[i]});
        }
        projects.sort(Comparator.comparingInt(a -> a[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int currentProject = 0; currentProject < numProjects; currentProject++) {
            while (index < total && projects.get(index)[0] <= initial) {
                pq.add(projects.get(index)[1]);
                index++;
            }
            if (pq.isEmpty()) {
                return initial;
            }
            initial += pq.poll();
        }
        return initial;
    }
}