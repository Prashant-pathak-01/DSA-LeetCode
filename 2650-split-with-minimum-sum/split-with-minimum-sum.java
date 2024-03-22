class Solution {
    public int splitNum(int num) {
        String str = String.valueOf(num);
        int arr[] = new int[str.length()];
        for(int i=0; i<arr.length; i++) arr[i] = str.charAt(i)-'0';
        Arrays.sort(arr);
        int first = 0;
        int second = 0;
        for(int i=0; i<arr.length; i+=2){
            first = first*10+arr[i];
            if(i+1==arr.length) break;
            second = second*10+arr[i+1];
        }
        return first+second;
    }
}