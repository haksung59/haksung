package com.study.test;

import java.util.Arrays;
import java.util.HashSet;

public class CamoTest3 {

    public static void main(String[] args) {

        String s = "2021:04:12:16:08:35";
        String[] times = {"01:06:30:00", "01:01:12:00", "00:00:09:25"};

        System.out.println(Arrays.toString(solution(s, times)));

    }

    static int[] solution(String s, String[] times){
        int[] answer = {};
        int saveNumber = times.length+1;
        int dayCount = 1;
        String[] arrSaveDate = new String[saveNumber];
        String[] sToArray = s.split(":");
        int year = Integer.parseInt(sToArray[0]);
        int month = Integer.parseInt(sToArray[1]);
        int day = Integer.parseInt(sToArray[2]);
        int hour = Integer.parseInt(sToArray[3]);
        int minute = Integer.parseInt(sToArray[4]);
        int second = Integer.parseInt(sToArray[5]);

        arrSaveDate[0] = year + ":" + month + ":" + day;
        for(int i=1; i<saveNumber; i++){
            String[] arrAddTime = times[i-1].split(":");
            int addMonth = 0;
            int addDay = Integer.parseInt(arrAddTime[0]);
            int addHour = Integer.parseInt(arrAddTime[1]);
            int addMinute = Integer.parseInt(arrAddTime[2]);
            int addSecond = Integer.parseInt(arrAddTime[3]);

            if(second+addSecond >= 60){
                second = second + addSecond - 60;
                addMinute++;
            }else {
                second += addSecond;
            }

            if(minute+addMinute >= 60){
                minute = minute + addMinute - 60;
                addHour++;
            }else {
                minute += addMinute;
            }

            if(hour+addHour >= 24) {
                hour = hour + addHour - 24;
                addDay++;
            }else {
                hour += addHour;
            }

            if(day+addDay > 30){
                addMonth += addDay/30;
                if(day + (addDay % 30) > 30) {
                    day = (day + (addDay % 30)) - 30;
                }else {
                    day = (day + (addDay % 30));
                }
            }else {
                day += addDay;
            }

            if(month + addMonth > 12){
                month = month + addMonth - 12;
                year++;
            }else {
                month += addMonth;
            }
            dayCount += addDay;

            arrSaveDate[i] = year + ":" + month + ":" + day;

        }

        HashSet<String> saveDate = new HashSet<>(Arrays.asList(arrSaveDate));
        int saveCnt = saveDate.size();

        answer = new int[]{saveCnt==dayCount ? 1 : 0, dayCount};

        return answer;
    }

}