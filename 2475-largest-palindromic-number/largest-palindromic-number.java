class Solution {
    public String largestPalindromic(String num) {
        int arr[] = new int[10];
        for(int i=0; i<num.length(); i++){
            arr[num.charAt(i)-'0']++;
        }
        StringBuilder res =  new StringBuilder();
        char middle = '#';
        for(int i=9; i>=0; i--){
            if(arr[i]%2==0){
                for(int j=0; j<arr[i]/2; j++) res.append((char)(i+'0'));
            }else{
                for(int j=0; j<arr[i]/2; j++) res.append((char)(i+'0'));
                if(middle=='#') middle = (char)(i+'0');
        }
        }
        if(res.length()==0 || res.charAt(0)=='0') return ""+(middle=='#'?'0':middle);
        
        StringBuilder temp = new StringBuilder(res);
        temp.reverse();
        if(middle=='#') return (res.append(temp)).toString();
        res.append(middle);
        return (res.append(temp)).toString();

    }
}