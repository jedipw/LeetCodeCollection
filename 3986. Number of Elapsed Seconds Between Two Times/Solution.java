class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        return toSeconds(endTime.split(":")) - toSeconds(startTime.split(":"));
    }

    public int toSeconds(String[] time) {
        int total = 0;

        total += Integer.parseInt(time[0]) * 3600;
        total += Integer.parseInt(time[1]) * 60;
        total += Integer.parseInt(time[2]);

        return total;
    }
}