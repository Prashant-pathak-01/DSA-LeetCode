class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0; i<numCourses; i++) map.put(i,new ArrayList<>());
        for(int i=0; i<prerequisites.length; i++){
            List<Integer> list = map.getOrDefault(prerequisites[i][0],new ArrayList<>());
            list.add(prerequisites[i][1]);
            map.put(prerequisites[i][0],list);
        }
        boolean visited[][] = new boolean[numCourses][numCourses];
        for(int i=0; i<numCourses; i++) {
            Queue<Integer> q = new LinkedList<>();
            q.add(i);
            boolean []mark = new boolean[numCourses];
            while(!q.isEmpty()){
                int temp = q.poll();
                mark[temp] = true;
                visited[i][temp] = true;
                for(int x:map.get(temp)){
                    if(!mark[x]){
                        q.add(x);
                        mark[x] = true;
                    }
                }
            }
        }
        List<Boolean> res = new ArrayList<>();
        for(int i=0; i<queries.length; i++){
            res.add(visited[queries[i][0]][queries[i][1]]);
        }
        return res;
    }
}