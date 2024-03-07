class Solution {
    public String reformatDate(String date) {
        List<String> monthList = new ArrayList<>();
        monthList.add("Jan"); monthList.add("Feb"); monthList.add("Mar"); monthList.add("Apr"); monthList.add("May"); monthList.add("Jun"); monthList.add("Jul"); monthList.add("Aug"); monthList.add("Sep"); monthList.add("Oct"); monthList.add("Nov"); monthList.add("Dec");
        String Date = "";
        String month = "";
        for(int i=0; i<date.length(); i++){
            if(date.charAt(i)==' '){
                Date = date.substring(0,i-2);
                month = String.valueOf(monthList.indexOf(date.substring(i+1,i+4))+1);
                break;
            }
        }
        if(month.length()==1) month = "0"+month;
        if(Date.length()==1) Date = "0"+Date; 
        String year = date.substring(date.length()-4);
        return year+"-"+month+"-"+Date;
    }
}