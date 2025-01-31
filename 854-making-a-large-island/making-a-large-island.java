class Solution {
    class Union{
        String parent[][];
        int size[][];
        int grid[][];
        Union(int n, int m, int grid[][]){
            this.grid = grid;
            parent = new String[n][m];
            size = new int[n][m];
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    parent[i][j] = i+" "+j;
                    size[i][j] = 1;
                }
            }
        }

        public String find(int i, int j){
            if(!parent[i][j].equals(i+" "+j)) {
                String str[] = parent[i][j].split(" ");
                return parent[i][j] = find(Integer.parseInt(str[0]),Integer.parseInt(str[1]));
            } else return parent[i][j];
        }
        public int merge(int i, int j){
            Set<String> set = new HashSet<>();
            if(i-1>=0 && grid[i-1][j]==1) set.add(find(Integer.parseInt(parent[i-1][j].split(" ")[0]),Integer.parseInt(parent[i-1][j].split(" ")[1])));
            //if(i+1<parent.length && grid[i+1][j]==1) set.add(parent[i+1][j]);                 
            if(j-1>=0 && grid[i][j-1]==1) set.add(find(Integer.parseInt(parent[i][j-1].split(" ")[0]),Integer.parseInt(parent[i][j-1].split(" ")[1]))); 
            //if(j+1>=0 && grid[i][j+1]==1) set.add(parent[i][j+1]); 
            String myParent = find(i,j);
            for(String str : set){
                String arr[] = str.split(" ");
                // String p1  = find(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]));
                //System.out.println(p1);
                size[Integer.parseInt(myParent.split(" ")[0])][Integer.parseInt(myParent.split(" ")[1])] += size[Integer.parseInt(arr[0])][Integer.parseInt(arr[1])];
                parent[Integer.parseInt(arr[0])][Integer.parseInt(arr[1])] = myParent;
                //System.out.println(parent[Integer.parseInt(p1.split(" ")[0])][Integer.parseInt(p1.split(" ")[1])]+" "+str);
            }
            return size[Integer.parseInt(myParent.split(" ")[0])][Integer.parseInt(myParent.split(" ")[1])];
        }


        public int calculate(int i, int j){
            Set<String> set = new HashSet<>();
            if(i-1>=0 && grid[i-1][j]==1) set.add(find(Integer.parseInt(parent[i-1][j].split(" ")[0]),Integer.parseInt(parent[i-1][j].split(" ")[1])));
            if(i+1<parent.length && grid[i+1][j]==1) set.add(find(Integer.parseInt(parent[i+1][j].split(" ")[0]),Integer.parseInt(parent[i+1][j].split(" ")[1])));                 
            if(j-1>=0 && grid[i][j-1]==1) set.add(find(Integer.parseInt(parent[i][j-1].split(" ")[0]),Integer.parseInt(parent[i][j-1].split(" ")[1])));
            if(j+1<parent[0].length && grid[i][j+1]==1) set.add(find(Integer.parseInt(parent[i][j+1].split(" ")[0]),Integer.parseInt(parent[i][j+1].split(" ")[1])));
            String myParent = find(i,j);
            int res = 1;
            for(String str : set){
                String arr[] = str.split(" ");
                //String p1  = find(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]));
                //System.out.println(p1);
                res+= size[Integer.parseInt(arr[0])][Integer.parseInt(arr[1])];
                //System.out.println(parent[Integer.parseInt(p1.split(" ")[0])][Integer.parseInt(p1.split(" ")[1])]+" "+str);
            }
            return res;
        }



        public void print(){
            for(String str[]: parent){
                System.out.println(Arrays.toString(str));
            }
        }

    }
    public int largestIsland(int[][] grid) {
        Union uf = new Union(grid.length, grid[0].length,grid);
        int res =0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid.length; j++){
                if(grid[i][j]==1){
                    res = Math.max(res,uf.merge(i,j));
                    //System.out.println(res);
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
        
        //uf.print();

        return res; 
    }
}