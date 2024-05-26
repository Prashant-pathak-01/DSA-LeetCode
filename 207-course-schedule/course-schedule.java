class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Set<Integer> list = new HashSet<>();
        int degree[] = new int [numCourses];
        List<List<Integer>> map  = new ArrayList<>();
        for(int i=0; i<numCourses; i++){
            map.add(new ArrayList<>());
        }
        for(int pre[]:prerequisites){
            map.get(pre[1]).add(pre[0]);
            degree[pre[0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<numCourses; i++) if(degree[i]==0) q.add(i);
        while(!q.isEmpty()){
            int course = q.poll();
            list.add(course);
            for(int x:map.get(course)){
                degree[x]--;
                if(degree[x]==0) q.add(x);
            }
        }
        return list.size()==numCourses;

    }
}