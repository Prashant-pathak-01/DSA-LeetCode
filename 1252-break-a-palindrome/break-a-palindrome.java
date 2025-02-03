class Solution {
    public String breakPalindrome(String palindrome) {
        int count =0;
        if(palindrome.length()<=1) return "";
        for(int i=0; i<palindrome.length(); i++){
            if(palindrome.charAt(i)=='a') count++;
        }
        if((count==palindrome.length())){
            return palindrome.substring(palindrome.length()-1)+"b";
        }else if(count==palindrome.length()-1){
           return palindrome.substring(0,palindrome.length()-1)+"b";
        }else{
            for(int i=0; i<palindrome.length(); i++){
                if(palindrome.charAt(i)!='a') return palindrome.substring(0,i)+"a"+palindrome.substring(i+1);
            }
        }
        return "";
    }
}