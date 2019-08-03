package com.mucko.filip.codewars;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fmucko
 */
public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        List<Character> string1 = new ArrayList<>();
        Character temp;
        for (int i = 0; i < str1.length(); i++) {
            string1.add(str1.charAt(i));
        }

        for (int i = 0; i < str2.length(); i++) {
            temp = str2.charAt(i);
            if (string1.contains(temp)) {
                string1.remove(temp);
            } else return false;
        }
        return true;
    }

}
