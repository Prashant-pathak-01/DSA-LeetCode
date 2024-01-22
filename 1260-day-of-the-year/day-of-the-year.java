class Solution {
    public int dayOfYear(String date) {
        int year = (date.charAt(0) - '0') * 1000 + (date.charAt(1) - '0')*100 +(date.charAt(2) - '0') * 10 + (date.charAt(3) - '0');
        int month = (date.charAt(5) - '0') * 10 + (date.charAt(6) - '0');
        int day = (date.charAt(8) - '0') * 10 + (date.charAt(9) - '0');
        int res = 0;

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 1; i < month; i++) {
            res += daysInMonth[i];

            if (i == 2) {
                res += (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 1 : 0;
            }
        }

        return res + day;
    }
}
