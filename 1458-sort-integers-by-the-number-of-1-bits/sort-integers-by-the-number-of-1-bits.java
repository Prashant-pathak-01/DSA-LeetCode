class Solution {
    public int[] sortByBits(int[] arr) {
        int countMap[][] = new int[arr.length][2];
        for(int i=0; i<arr.length; i++){
            int c = 0;
            int temp = arr[i];
            while(temp>0){
                if((temp&1)==1) c++;
                temp = temp>>1;
            }
            countMap[i][1] = arr[i];
            countMap[i][0] = c;
        }
        Arrays.sort(countMap,(a,b)->{
            if(a[0]!=b[0]) return a[0]-b[0];
            else return a[1]-b[1];
            }
        );
        for(int i=0; i<arr.length; i++){
            arr[i] = countMap[i][1];
        }
        return arr;
    }
}