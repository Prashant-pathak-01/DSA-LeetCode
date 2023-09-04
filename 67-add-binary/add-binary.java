class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res= new StringBuilder();
        StringBuilder aa = new StringBuilder(a);
        StringBuilder bb = new StringBuilder(b);
        bb.reverse();
        aa.reverse();
        char carry = '0';
        for(int i=0; i<Math.min(a.length(), b.length()); i++){
            if(aa.charAt(i)=='0' && bb.charAt(i)=='0'){
                res.append(carry);
                carry = '0';
            } else if((aa.charAt(i)=='0' && bb.charAt(i)=='1') || (aa.charAt(i)=='1' && bb.charAt(i)=='0')){
                if(carry =='0') res.append('1');
                else res.append('0');
            } else{
                if(carry =='0') {
                    res.append('0');
                    carry = '1';
                } else{
                    res.append('1');
                }
            }
        }        
        if(a.length()>b.length()){
            for(int i=b.length(); i<a.length(); i++){
                if(carry=='1'){
                    if(aa.charAt(i)=='0'){
                        res.append('1');
                        carry = '0';
                    } else{
                        res.append('0');
                    }
                } else{

                    res.append((char)aa.charAt(i));
                }
            }
        } else{
            for(int i=a.length(); i<b.length(); i++){
                if(carry=='1'){
                    if(bb.charAt(i)=='0'){
                        res.append('1');
                        carry = '0';
                    } else{
                        res.append('0');
                    }
                } else{

                    res.append((char)bb.charAt(i));
                }
            }
        }
        if(carry=='1') res.append('1');
        return res.reverse().toString();
    }
}