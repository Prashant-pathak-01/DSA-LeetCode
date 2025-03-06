class Solution {
    public double getArea(double mid, int squares[][]){
        double left = 0;       
        for(int i=0; i<squares.length; i++){
            if(mid>=squares[i][1]){
                left+=(double)(Math.min(mid,squares[i][1]+squares[i][2])-squares[i][1])*squares[i][2];
            }
        } 
        return left;
    }
    public double separateSquares(int[][] squares) {
        double max =0;
        double total =0;
        for(int i=0; i<squares.length; i++) {
            max = Math.max(squares[i][1]+squares[i][2],max);
            total+=((double)squares[i][2]*(double)squares[i][2])/2;
        }
        double min = 0;
        double res = 0;
        for(int i=0; i<60; i++){
            double mid = (max+min)/2;
            double area = getArea(mid,squares);
            if(total-area<=0){
                max = mid;
                res = mid;
            }else min = mid;

        }
        return res;
    }
}