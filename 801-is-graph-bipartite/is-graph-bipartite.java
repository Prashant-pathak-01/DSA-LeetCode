class Solution {
    public boolean isBipartite(int[][] graph) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[graph.length];
        for (int x = 0; x < graph.length; x++) {
            if (!visited[x]) {
                q.add(x);
                l1.add(x);
                while (!q.isEmpty()) {
                    int temp = q.poll();
                    visited[temp] = true;
                    if (l1.contains(temp)) {
                        for (int i = 0; i < graph[temp].length; i++) {
                            if (l1.contains(graph[temp][i]))
                                return false;
                            if (!l2.contains(graph[temp][i])) {
                                l2.add(graph[temp][i]);
                                q.add(graph[temp][i]);
                            }
                        }
                    } else if (l2.contains(temp)) {
                        for (int i = 0; i < graph[temp].length; i++) {
                            if (l2.contains(graph[temp][i]))
                                return false;
                            if (!l1.contains(graph[temp][i])) {
                                l1.add(graph[temp][i]);
                                q.add(graph[temp][i]);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}