package com.mucko.filip.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TimeFormatter {

    private static final Integer SECONDS_IN_YEAR = 365 * 24 * 60 * 60;
    private static final Integer SECONDS_IN_DAY = 24 * 60 * 60;
    private static final Integer SECONDS_IN_HOUR = 60 * 60;
    private static final Integer SECONDS_IN_MINUTE = 60;
    public static List<Integer> timePeriods;
    public static ArrayList<String> rawAnswer;

    public static String formatDuration(int seconds) {
        if (seconds == 0) {
            return "now";
        }
        fillTimePeriods(seconds);
        generateArrayAnswer();
        appendS();
        removeUnnecessaryElements();
        return generateAnswer().toString();
    }

    private static StringBuilder generateAnswer() {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < rawAnswer.size(); i += 2) {
            if (i + 4 < rawAnswer.size()) {
                answer.append(rawAnswer.get(i));
                answer.append(rawAnswer.get(i + 1));
                answer.append(", ");
            } else if (i + 2 < rawAnswer.size()) {
                answer.append(rawAnswer.get(i));
                answer.append(rawAnswer.get(i + 1));
                answer.append(" and ");
            } else {
                answer.append(rawAnswer.get(i));
                answer.append(rawAnswer.get(i + 1));
            }
        }
        return answer;
    }

    private static void generateArrayAnswer() {
        rawAnswer = new ArrayList<>();
        rawAnswer.addAll(Arrays.asList(timePeriods.get(0).toString(), " year", timePeriods.get(1).toString(), " day",
                                       timePeriods.get(2).toString(), " hour", timePeriods.get(3).toString(), " minute",
                                       timePeriods.get(4).toString(), " second"));
    }

    private static void removeUnnecessaryElements() {
        for (int i = 0; i < rawAnswer.size(); i += 2) {
            if (Integer.valueOf(rawAnswer.get(i)) == 0) {
                rawAnswer.remove(i);
                rawAnswer.remove(i);
                i -= 2;
            }
        }
    }

    private static void appendS() {
        for (int i = 0; i < rawAnswer.size(); i += 2) {
            if (Integer.valueOf(rawAnswer.get(i)) > 1) {
                rawAnswer.set(i + 1, rawAnswer.get(i + 1) + "s");
            }
        }
    }

    public static void fillTimePeriods(int seconds) {
        timePeriods = new ArrayList<>();

        Integer nrOfYears = seconds / SECONDS_IN_YEAR;
        timePeriods.add(nrOfYears);
        seconds -= nrOfYears * SECONDS_IN_YEAR;

        Integer nrOfDays = seconds / SECONDS_IN_DAY;
        timePeriods.add(nrOfDays);
        seconds -= nrOfDays * SECONDS_IN_DAY;

        Integer nrOfHours = seconds / SECONDS_IN_HOUR;
        timePeriods.add(nrOfHours);
        seconds -= nrOfHours * SECONDS_IN_HOUR;

        Integer nrOfMinutes = seconds / SECONDS_IN_MINUTE;
        timePeriods.add(nrOfMinutes);
        seconds -= nrOfMinutes * SECONDS_IN_MINUTE;

        timePeriods.add(seconds);
    }

}
