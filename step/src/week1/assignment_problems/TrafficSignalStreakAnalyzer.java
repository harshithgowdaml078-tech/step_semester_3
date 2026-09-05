package week1.assignment_problems;

public class TrafficSignalStreakAnalyzer {

    static void findLongestStreak(String signalLog) {
        int maxLen = 1, curLen = 1;
        char maxChar = signalLog.charAt(0);
        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == signalLog.charAt(i - 1)) {
                curLen++;
            } else {
                curLen = 1;
            }
            if (curLen > maxLen) {
                maxLen = curLen;
                maxChar = signalLog.charAt(i);
            }
        }
        System.out.println("Longest Streak: '" + maxChar + "' repeated " + maxLen + " times");
    }

    public static void main(String[] args) {
        findLongestStreak("RRGGGYRR");
        findLongestStreak("RRRRYYGG");
    }
}
