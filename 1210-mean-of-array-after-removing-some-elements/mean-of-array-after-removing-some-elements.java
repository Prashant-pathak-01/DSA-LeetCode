class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        double min = arr.length*0.05;
        double max = arr.length-min;
        double sum = 0;
        int count =0;
        for(int i=(int)min; i<(int)max; i++){
            sum+=arr[i];
            count++;
        }
        return sum/count;
    }
}