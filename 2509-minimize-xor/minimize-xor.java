class Solution {
    public int minimizeXor(int num1, int num2) {
        int count1 =0;
        while(num2>0){
            if((num2&1)==1) count1++;
            num2=num2>>1;
        }
        int count2 =0;
        int temp = num1;
        while(temp>0){
            if((temp&1)==1) count2++;
            temp=temp>>1;
        }
        if(count2<=count1){
            int res=  0;
            int index =0;
            count1-=count2;
            while(num1>0 || count1!=0){
                if((num1&1)==1){
                    res = res | (1<<index);
                }else if(count1>0){
                    res = res | (1<<index);
                    count1--;
                }
                num1=num1>>1;
                index++;
            }
            return res;
        }else{
            int res =0;
            count2-=count1;
            // System.out.println(count2);
            int index =0;
            while(num1>0){
                if((num1&1)==1){
                    if(count2>0) count2--;
                    else res = res|(1<<index);
                }
                num1=num1>>1;
                index++;
            }
            return res;
        }
    }
}