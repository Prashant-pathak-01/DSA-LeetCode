class Solution {
    public int latestDayToCross(int row, int col, int[][] cells) {
        int res = 0;
        int left = 0;
        int right = cells.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(isValid(cells,row,col,mid)){
                res = mid+1;
                left = mid+1;
            }else right = mid-1;
        }
        return res;
    }
    public boolean isValid(int cells[][],int row, int col, int mid){
        int arr[][] = new int[row][col];
        for(int i=0; i<=mid; i++) arr[cells[i][0]-1][cells[i][1]-1] = 1;
        Queue<int []> q = new LinkedList<>();
        for(int i=0; i<col; i++) if(arr[0][i]==0) {
            arr[0][i] = 1;
            q.add(new int[]{0,i});
        }
        while(!q.isEmpty()){
            int []temp = q.poll();
            if(temp[0]==arr.length-1) return true;
            
            if(temp[1]>0 && arr[temp[0]][temp[1]-1]==0) {
                q.add(new int[]{temp[0],temp[1]-1});
                arr[temp[0]][temp[1]-1] = 1;
            }
            if(temp[1]<arr[0].length-1 && arr[temp[0]][temp[1]+1]==0) {
                q.add(new int[]{temp[0],temp[1]+1});
                arr[temp[0]][temp[1]+1] = 1;

            }
            if(temp[0]>0 && arr[temp[0]-1][temp[1]]==0) {
                q.add(new int[]{temp[0]-1,temp[1]});
                arr[temp[0]-1][temp[1]] = 1;
                
            }
            if(temp[0]<arr.length-1 && arr[temp[0]+1][temp[1]]==0) {
                q.add(new int[]{temp[0]+1,temp[1]});
                arr[temp[0]+1][temp[1]] = 1;
            
            }

        }
        return false;

    }
}