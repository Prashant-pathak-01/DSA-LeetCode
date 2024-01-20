class Solution {
    public String frequencySort(String s) {
        int arr[][] = new int[128][2];
        for(int i=0; i<128;i++){
            arr[i][0]  = i;
        }
        for(int i=0; i<s.length(); i++){
            if(Character.isLowerCase(s.charAt(i))) arr[(int)(s.charAt(i)-'a')][1]++;
            else if (Character.isUpperCase(s.charAt(i))) arr[(int)(s.charAt(i)-'A')+26][1]++;
            else arr[(int)(s.charAt(i)-'0')+52][1]++;
        }
        Arrays.sort(arr, Comparator.comparingInt((int[] a) -> a[1]).reversed());
        StringBuilder res = new StringBuilder();
        for(int i=0; i<arr.length; i++) {
            if(arr[i][1]==0) break;
            for(int k=0; k<arr[i][1]; k++){
                if(arr[i][0]<26) res.append((char)('a'+arr[i][0]));
                else if(arr[i][0]<52) res.append((char)('A'+arr[i][0]-26));
                else res.append((char)('0'+arr[i][0]-52));
            }
        }
        return res.toString();
    }
}