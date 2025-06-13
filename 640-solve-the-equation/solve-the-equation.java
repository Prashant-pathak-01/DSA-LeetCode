class Solution {
    public String solveEquation(String equation) {
        int leftX = 0;
        int leftConst = 0;
        int rightX = 0;
        int rightConst = 0;
        boolean flag = true;
        boolean negative = false;

        int num =0;
        for(int i=0; i<equation.length(); i++){
            char ch = equation.charAt(i);
            if(ch=='='){
                leftConst+= ( num*(negative?-1:1));
                num =0;
                flag = false;
                negative = false;
            }
            else if(flag){
                if(Character.isDigit(ch)) num = (num*10)+(int)(ch-'0');
                else if(ch=='x') {
                    if(i==0 || (i>0 && !Character.isDigit(equation.charAt(i-1)))) num = Math.max(num,1);
                    leftX+=(num*(negative?-1:1));
                    num =0;
                    negative = false;
                }else{
                    leftConst+= ( num*(negative?-1:1));
                    num =0;
                    if(ch=='-') negative = true;
                    else negative = false;
                }
            }else{
                if(Character.isDigit(ch)) num = (num*10)+(int)(ch-'0');
                else if(ch=='x') {
                    if(i==0 || (i>0 && !Character.isDigit(equation.charAt(i-1)))) num = Math.max(num,1);
                    rightX+=(num*(negative?-1:1));
                    num =0;
                    negative = false;
                }else{
                    rightConst+= ( num*(negative?-1:1));
                    num =0;
                    if(ch=='-') negative = true;
                    else negative = false;
                }
            }
        }
        rightConst+= ( num*(negative?-1:1));

        // System.out.println(leftX+" "+leftConst+" "+rightX+" "+rightConst);

        if(leftX==rightX) {
            if(leftConst-rightConst==0) return "Infinite solutions";
            else return "No solution";
        }
        else return "x="+((rightConst-leftConst)/(leftX-rightX));
    }
}