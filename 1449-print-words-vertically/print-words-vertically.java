class Solution {
    public List<String> printVertically(String s) {
        List<String> list = new ArrayList<>();
        int max =0;
        String arr[] = s.split(" ");
        for(String str:arr) max = Math.max(max,str.length());
        for(int i=0; i<max; i++){
            StringBuilder str = new StringBuilder();
            int prev =0;
            for(int j=0; j<arr.length; j++){
                if(arr[j].length()<=i) {
                    str.append(" ");
                    prev++;
                }
                else {
                    str.append(arr[j].charAt(i));
                    prev =0;
                }
            }
            list.add(str.toString().substring(0,str.length()-prev));
        }
        return list;
    }
}