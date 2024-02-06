class Solution {
    public boolean check(int arr1[], int arr2[]){
        for(int i=0; i<26; i++){
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int a[] = new int[26];
        for(int i=0; i<s1.length(); i++) a[s1.charAt(i)-'a']++;
        int b[] = new int[26];
        int j = 0;
        for(int i=0; i<s2.length(); i++){
            b[s2.charAt(i)-'a']++;
            if(i<s1.length()-1) continue;
            if(check(a,b)) return true;
            b[s2.charAt(j)-'a']--;
            j++;
        }
        return false;
    }
}