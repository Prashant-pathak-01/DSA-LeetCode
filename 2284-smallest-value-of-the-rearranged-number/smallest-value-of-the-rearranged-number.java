class Solution {
    public long smallestNumber(long num) {
        if(num==0) return 0;
        String str = String.valueOf(num);
        int i = 0;
        long neg = 1;
        if(num<0){
            i++;
            neg = -1;
        } 
        long res = 0;
        if(neg==1){
            int arr[] = new int[10];
            while(i<str.length()){
                arr[str.charAt(i)-'0']++;
                i++;
            }
            i=1;
            while(arr[i]==0) i++;
            arr[i]--;
            res=res*10+i;
            for(i=0;i<=9; i++ ){
                if(arr[i]!=0){
                    for(int j=0; j<arr[i]; j++){
                        res*=10;
                        res+=i;
                    }
                }
            }
        }else{
            int arr[] =new int[str.length()];
            while(i<str.length()){
                arr[i-1] = str.charAt(i)-'0';
                i++;
            }
            Arrays.sort(arr);
            for(int x=str.length()-1; x>=0; x--){
                res*=10;
                res+=arr[x];
            }
            res/=10;
        }
        
        return res*neg;


    }
}