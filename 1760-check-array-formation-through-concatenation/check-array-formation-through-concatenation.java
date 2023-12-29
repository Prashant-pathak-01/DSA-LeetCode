class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        for(int i=0; i<arr.length; i++){
            boolean temp = false;
            int indx = 0;
            for(int j=0; j<pieces.length; j++){
                if(pieces[j][0]==arr[i]){
                    temp = true;
                    indx = j;
                }
            }
            if(temp){
                for(int j=0; j<pieces[indx].length; j++){
                    if(i>=arr.length || arr[i++]!=pieces[indx][j]) return false;
                }
            i--;
            }else{
                System.out.println(i);
                return false;
            }
        }
        return true;
    }
}