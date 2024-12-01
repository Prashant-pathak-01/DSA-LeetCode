class Solution {
    public int minSwapsCouples(int[] row) {
        int res =0 ;
        for(int i=0; i<row.length-1; i+=2){
            if(row[i]%2==0){
                if(row[i+1]!=row[i]+1){
                    res++;
                    int j = i+1;
                    while(j<row.length){
                        if(row[j]==row[i]+1) break;
                        j++;
                    }
                    int temp = row[i+1];
                    row[i+1] = row[j];
                    row[j] = temp;
                }
            }else{
                if(row[i+1]!=row[i]-1){
                    res++;
                    int j = i+1;
                    while(j<row.length){
                        if(row[j]==row[i]-1) break;
                        j++;
                    }
                    int temp = row[i+1];
                    row[i+1] = row[j];
                    row[j] = temp;
                }
            }
        }
        return res;
    }
}