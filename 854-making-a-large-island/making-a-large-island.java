class Solution {
    class Pair{
        int i;
        int j;
        Pair(int i, int j){
            this.i = i;
            this.j = j;
        }
    }
    class Union{
        Pair parent[][];
        int size[][];
        int grid[][];
        Union(int n, int m, int grid[][]){
            this.grid = grid;
            parent = new Pair[n][m];
            size = new int[n][m];
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    parent[i][j] = new Pair(i,j);
                    size[i][j] = 1;
                }
            }
        }

        public Pair find(int i, int j){
            if(parent[i][j].i!=i || parent[i][j].j!=j) {
                return parent[i][j] = find(parent[i][j].i,parent[i][j].j);
            } else return parent[i][j];
        }
        public int merge(int i, int j){
            Set<Pair> set = new HashSet<>();
            if(i-1>=0 && grid[i-1][j]==1) set.add(find(parent[i-1][j].i,parent[i-1][j].j));
            if(j-1>=0 && grid[i][j-1]==1) set.add(find(parent[i][j-1].i,parent[i][j-1].j));
            Pair myParent = find(i,j);
            for(Pair pair : set){
                size[myParent.i][myParent.j] += size[pair.i][pair.j];
                parent[pair.i][pair.j] = myParent;
            }
            return size[myParent.i][myParent.j];
        }


        public int calculate(int i, int j){
            Set<Pair> set = new HashSet<>();
            if(i-1>=0 && grid[i-1][j]==1) set.add(find(parent[i-1][j].i,parent[i-1][j].j));
            if(i+1<parent.length && grid[i+1][j]==1) set.add(find(parent[i+1][j].i,parent[i+1][j].j));                 
            if(j-1>=0 && grid[i][j-1]==1) set.add(find(parent[i][j-1].i,parent[i][j-1].j));
            if(j+1<parent[0].length && grid[i][j+1]==1) set.add(find(parent[i][j+1].i,parent[i][j+1].j));
            Pair myParent = find(i,j);
            int res = 1;
            for(Pair p : set) res+= size[p.i][p.j];
            return res;
        }
    }

    public int largestIsland(int[][] grid) {
        Union uf = new Union(grid.length, grid[0].length,grid);
        int res =0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid.length; j++){
                if(grid[i][j]==1){
                    res = Math.max(res,uf.merge(i,j));
                }
            }
        }

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid.length; j++){
                if(grid[i][j]==0){
                    res = Math.max(res,uf.calculate(i,j));
                }
            }
        }  
        return res; 
    }
}