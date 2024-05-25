class Pair{
    int a;
    int b;
    Pair(int d1, int d2){
        a = d1;
        b = d2;
    }
}
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(color==image[sr][sc]) return image;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(sr,sc));
        int fill = image[sr][sc];
        image[sr][sc] = color;
        int r[] = {0,0,1,-1};
        int c[] = {1,-1,0,0};
        
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                Pair pair = q.poll();
                for(int k=0; k<4; k++){
                    int row = pair.a+r[k];
                    int col = pair.b+c[k];
                    if(row>=0 && col>=0 &&  row<image.length && col<image[0].length && image[row][col]==fill){
                        q.add(new Pair(row,col));
                        image[row][col]=color;
                    }
                }

            }
        }
        return image;
    }
}