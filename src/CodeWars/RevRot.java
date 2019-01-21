package CodeWars;

import java.util.ArrayList;
import java.util.List;

public class RevRot {

    public static String reverseString(String chunk) {
        StringBuilder reversed = new StringBuilder();
        for (int i = chunk.length() - 1; i >= 0; i--) {
            reversed.append(chunk.charAt(i));
        }
        return reversed.toString();
    }

    public static String rotateString(String chunk) {
        StringBuilder rotated = new StringBuilder();
        for (int i = 1; i < chunk.length(); i++)
            rotated.append(chunk.charAt(i));
        rotated.append(chunk.charAt(0));
        return rotated.toString();
    }

    public static boolean conditionFullFilled(String chunk) {
        int testNr = 0;
        for (int i = 0; i < chunk.length(); i++) {
            testNr += Integer.parseInt(String.valueOf(chunk.charAt(i)))
                    * Integer.parseInt(String.valueOf(chunk.charAt(i)))
                    * Integer.parseInt(String.valueOf(chunk.charAt(i)));
            testNr%=10;
        }
        if (testNr % 2 == 0) return true;
        return false;
    }

    public static List<String> cutToChunks(String strng, int sz) {
        int index = 0;
        List<String> listOfChunks = new ArrayList<>();
        StringBuilder chunkBuilder = new StringBuilder();
        for (int i = 0; i < strng.length() / sz; i++) {
            for (int j = index; j < index + sz; j++) {
                chunkBuilder.append(strng.charAt(j));
            }
            index += sz;
            listOfChunks.add(chunkBuilder.toString());
            chunkBuilder.delete(0, chunkBuilder.length());
        }
        return listOfChunks;
    }

    public static String revRot(String strng, int sz) {

        if (sz <= 0) return "";
        StringBuilder newString = new StringBuilder();
        List<String> listOfChunks = cutToChunks(strng, sz);
        for (int i = 0; i < listOfChunks.size(); i++) {
            if (conditionFullFilled(listOfChunks.get(i))) {
                newString.append(reverseString(listOfChunks.get(i)));
            } else {
                newString.append(rotateString(listOfChunks.get(i)));
            }
        }
        return newString.toString();
    }


}
