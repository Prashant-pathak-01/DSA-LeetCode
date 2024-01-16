class Solution {
    public int countPoints(String rings) {
        int arr[][] = new int[10][3];
        for(int i=0; i<rings.length(); i+=2){
            int temp = 0;
            if(rings.charAt(i)=='R') temp = 0;
            if(rings.charAt(i)=='G') temp = 1;
            if(rings.charAt(i)=='B') temp = 2;

            arr[(int)(rings.charAt(i+1)-'0')][temp] = 1;
        }

        int res= 0;
        for(int i=0; i<10; i++) if(arr[i][0]==1 && arr[i][1]==1 && arr[i][2]==1) res++;
        return res;
    }
}