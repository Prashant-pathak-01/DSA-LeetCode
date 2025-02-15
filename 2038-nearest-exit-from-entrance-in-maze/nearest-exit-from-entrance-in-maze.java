class Solution {
    class Pair{
        int x;
        int y;
        int count;
        Pair(int x, int y, int count){
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }
    public int nearestExit(char[][] maze, int[] entrance) {
        Queue<Pair> q = new LinkedList<>();
        boolean visited[][] = new boolean[maze.length][maze[0].length];
        q.add(new Pair(entrance[0],entrance[1],0));
        while(!q.isEmpty()){
            Pair temp = q.poll();
            visited[temp.x][temp.y] = true;
            if((temp.x==0 || temp.x==maze.length-1 || temp.y==0 || temp.y==maze[0].length-1) && !(temp.x==entrance[0] && temp.y==entrance[1]) ){
                return temp.count;
            }
            int r[] = {1,-1,0,0};
            int c[] = {0,0,1,-1};
            for(int i=0; i<4; i++){
                if(temp.x+r[i]>=0 && temp.x+r[i]<maze.length && temp.y+c[i]>=0 && temp.y+c[i]<maze[0].length &&  maze[temp.x+r[i]][temp.y+c[i]]=='.' &&  !visited[temp.x+r[i]][temp.y+c[i]]){
                    visited[temp.x+r[i]][temp.y+c[i]] = true;
                    q.add(new Pair(temp.x+r[i],temp.y+c[i],temp.count+1));

                }
            }
        }
        return -1;

    }
}