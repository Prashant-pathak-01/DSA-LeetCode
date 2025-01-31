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
        int grid[][];
        Union(int n, int m, int grid[][]){
            parent = new Pair[n][m];
            this.grid = grid;
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    parent[i][j] = new Pair(i,j);
                }
            }
        }

        public Pair find(int i, int j){
            if(parent[i][j].i!=i || parent[i][j].j!=j) return find(parent[i][j].i,parent[i][j].j);
            return parent[i][j];
        }

        public void merge(int i, int j){
            if(grid[i][j]==1){
                if(j-1>=0 && (grid[i][j-1]==1 || grid[i][j-1]==4 || grid[i][j-1]==6)){
                    Pair myParent = find(i,j);
                    Pair sideParent = find(i,j-1);
                    parent[sideParent.i][sideParent.j]=parent[myParent.i][myParent.j];
                }
            }else if(grid[i][j]==2){
                if(i-1>=0 && (grid[i-1][j]==2 || grid[i-1][j]==3 || grid[i-1][j]==4)){
                    Pair myParent = find(i,j);
                    Pair sideParent = find(i-1,j);
                    parent[sideParent.i][sideParent.j]=parent[myParent.i][myParent.j];
                }
            }else if(grid[i][j]==3){
                if(j-1>=0 && (grid[i][j-1]==1 || grid[i][j-1]==4 || grid[i][j-1]==6)){
                    Pair myParent = find(i,j);
                    Pair sideParent = find(i,j-1);
                    
                    parent[sideParent.i][sideParent.j]=parent[myParent.i][myParent.j];
                }
            }else if(grid[i][j]==5){
                if(j-1>=0 && (grid[i][j-1]==1 || grid[i][j-1]==4 || grid[i][j-1]==6)){
                    Pair myParent = find(i,j);
                    Pair sideParent = find(i,j-1);
                    parent[sideParent.i][sideParent.j]=parent[myParent.i][myParent.j];
                }
                if(i-1>=0 && (grid[i-1][j]==2 || grid[i-1][j]==3 || grid[i-1][j]==4)){
                    Pair myParent = find(i,j);
                    Pair sideParent = find(i-1,j);
                    parent[sideParent.i][sideParent.j]=parent[myParent.i][myParent.j];
                }
            }if(grid[i][j]==6){
                if(i-1>=0 && (grid[i-1][j]==2 || grid[i-1][j]==3 || grid[i-1][j]==4)){
                    Pair myParent = find(i,j);
                    Pair sideParent = find(i-1,j);
                    parent[sideParent.i][sideParent.j]=parent[myParent.i][myParent.j];
                }
            }
            //print();
            //System.out.println();
        }

        public boolean checkPath(){
            Pair parentS = find(0,0);
            Pair parentE = find(parent.length-1,parent[0].length-1);
            boolean check = (parentS.i==parentE.i) && (parentS.j==parentE.j);
            return check;
        }

        public void print(){
            for(Pair i[]:parent){
                for(Pair j:i) System.out.print(j.i+" "+j.j+"  ");
                System.out.println();
            }
        }
        
    }
    public boolean hasValidPath(int[][] grid) {
        int res = 0;
        Union uf = new Union(grid.length,grid[0].length,grid);
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                uf.merge(i,j);
            }
        }
        //uf.print();
        return uf.checkPath();
    }
}