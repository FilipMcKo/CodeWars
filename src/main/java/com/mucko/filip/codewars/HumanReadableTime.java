package com.mucko.filip.codewars;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        return String.format("%02d:%02d:%02d", seconds / 3600, ((seconds - seconds / 3600 * 3600) / 60), seconds % 60);
    }
}
