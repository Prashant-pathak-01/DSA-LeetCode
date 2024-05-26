class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<numCourses; i++) list.add(new ArrayList<>());
        int degree[] = new int[numCourses];
        for(int x[]:prerequisites){
            list.get(x[1]).add(x[0]);
            degree[x[0]]++;
        }
        
        int res[] = new int[numCourses];
        int y = 0;
        
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<numCourses; i++) if(degree[i]==0) q.add(i);
        while(!q.isEmpty()){
            int course = q.poll();
            //if(y==numCourses) return new int[0];
            res[y++] = course;
            for(int x:list.get(course)){
                degree[x]--;
                if(degree[x]==0) q.add(x);
            }
        }
        return (y==numCourses) ? res: new int[0];
    }
}