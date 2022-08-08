package The_Required_Tasks.Lvl4.HumanReadableDuration;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        System.out.println(formatDuration(1));
    }

    public static String formatDuration(int seconds) {
        if (seconds == 0) {
            return "now";
        }
        ArrayList<String> listOfTimes = new ArrayList<String>();
        if (seconds / 31536000 > 0) {
            listOfTimes.add(timeConverter(seconds / 31536000, "year"));
            seconds %= 31536000;
        }
        if (seconds / 86400 > 0) {
            listOfTimes.add(timeConverter(seconds / 86400, "day"));
            seconds %= 86400;
        }
        if (seconds / 3600 > 0) {
            listOfTimes.add(timeConverter(seconds / 3600, "hour"));
            seconds %= 3600;
        }
        if (seconds / 60 > 0) {
            listOfTimes.add(timeConverter(seconds / 60, "minute"));
            seconds %= 60;
        }
        if (seconds > 0) {
            listOfTimes.add(timeConverter(seconds, "second"));
        }
        if (listOfTimes.size() == 1) {
            return (listOfTimes.get(0));
        } else {
            String strResult = "";
            for (int i = 0; i < listOfTimes.size() - 2; i++) {
                strResult += (listOfTimes.get(i) + ", ");
            }
            strResult += (listOfTimes.get(listOfTimes.size() - 2) + " and " + listOfTimes.get(listOfTimes.size() - 1));
            return strResult;
        }
    }

    public static String timeConverter(long longTime, String timeTo) {

        if (longTime == 1) {
            return (longTime + " " + timeTo);
        } else {
            return (longTime + " " + timeTo + "s");
        }
    }
}