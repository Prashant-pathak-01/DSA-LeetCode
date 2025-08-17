class Solution {
    public int minSensors(int n, int m, int k) {
        int x = (n+(2*k))/((2*k)+1);
        int y = (m+(2*k))/((2*k)+1);
        return x*y;
    }
}