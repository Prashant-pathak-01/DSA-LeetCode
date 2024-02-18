import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isPrime(int n){
        if(n<=10) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public void generate(int mat[][], int i, int j, int num, String pos,Map<Integer,Integer> map){
        if(i >= mat.length || j >= mat[0].length || i < 0 || j < 0) return;
        num = num * 10 + mat[i][j];
        if(num > 10 && isPrime(num)) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        if(pos.equals("-1") || pos.equals("r")) generate(mat, i, j+1, num, "r",map);
        if(pos.equals("-1") || pos.equals("l")) generate(mat, i, j-1, num, "l",map);
        if(pos.equals("-1") || pos.equals("b")) generate(mat, i+1, j, num, "b",map);
        if(pos.equals("-1") || pos.equals("t")) generate(mat, i-1, j, num, "t",map);
        if(pos.equals("-1") || pos.equals("rb")) generate(mat, i+1, j+1, num, "rb",map);
        if(pos.equals("-1") || pos.equals("lt")) generate(mat, i-1, j-1, num, "lt",map);
        if(pos.equals("-1") || pos.equals("lb")) generate(mat, i+1, j-1, num, "lb",map);
        if(pos.equals("-1") || pos.equals("rt")) generate(mat, i-1, j+1, num, "rt",map);
        return;
    }

    public int mostFrequentPrime(int[][] mat) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<mat.length; i++)
            for(int j=0; j<mat[0].length; j++)
                generate(mat, i, j, 0, "-1",map);
        int res= -1;
        int max = 0;
        for(Map.Entry<Integer,Integer> key:map.entrySet()){
            if(key.getValue()>max) {
                res = key.getKey();
                max = key.getValue();
                }else if(key.getValue()==max){
                    res = Math.max(res,key.getKey());
                }
        }
        return res>10?res:-1;
    }
}
