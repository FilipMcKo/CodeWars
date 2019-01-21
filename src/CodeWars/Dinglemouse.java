package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Dinglemouse {

    public static int[] sort(final int array[]) {
        List<Integer> intList = new ArrayList<>();
        for (int i : array) {
            intList.add(i);
        }

        intList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {

                String o1 = integerToString(i1);
                String o2 = integerToString(i2);

                if (o1.length() > o2.length()) {
                    for (int i = 0; i < o2.length(); i++) {
                        if ((int) o1.charAt(i) < (int) o2.charAt(i)) return -1;
                        else if ((int) o1.charAt(i) > (int) o2.charAt(i)) return 1;
                    }
                } else {
                    for (int i = 0; i < o1.length(); i++) {
                        if ((int) o1.charAt(i) < (int) o2.charAt(i)) return -1;
                        else if ((int) o1.charAt(i) > (int) o2.charAt(i)) return 1;
                    }
                }

                if (o1.length() > o2.length()) return 1;
                else if (o1.length() < o2.length()) return -1;

                return 0;
            }
        });

        int[] finalArr = new int[intList.size()];
        for (int i = 0; i < finalArr.length; i++) {
            finalArr[i] = intList.get(i);
        }

        return finalArr;
    }

    private static String integerToString(Integer ix) {
        if (ix == 0) return "zero";
        StringBuilder numberName = new StringBuilder();
        switch (ix / 100) {
            case 1:
                numberName.append("one hundred");
                break;
            case 2:
                numberName.append("two hundred");
                break;
            case 3:
                numberName.append("three hundred");
                break;
            case 4:
                numberName.append("four hundred");
                break;
            case 5:
                numberName.append("five hundred");
                break;
            case 6:
                numberName.append("six hundred");
                break;
            case 7:
                numberName.append("seven hundred");
                break;
            case 8:
                numberName.append("eight hundred");
                break;
            case 9:
                numberName.append("nine hundred");
                break;
        }

        if (ix % 100 > 9 && ix % 100 < 20) {
            switch (ix % 100) {
                case 10:
                    numberName.append("ten");
                    break;
                case 11:
                    numberName.append("eleven");
                    break;
                case 12:
                    numberName.append("twelve");
                    break;
                case 13:
                    numberName.append("thirteen");
                    break;
                case 14:
                    numberName.append("fourteen");
                    break;
                case 15:
                    numberName.append("fifteen");
                    break;
                case 16:
                    numberName.append("sixteen");
                    break;
                case 17:
                    numberName.append("seventeen");
                    break;
                case 18:
                    numberName.append("eighteen");
                    break;
                case 19:
                    numberName.append("nineteen");
                    break;

            }
            return numberName.toString();
        }

        switch (ix % 100 - ix % 10) {
            case 20:
                numberName.append("twenty");
                break;
            case 30:
                numberName.append("thirty");
                break;
            case 40:
                numberName.append("forty");
                break;
            case 50:
                numberName.append("fifty");
                break;
            case 60:
                numberName.append("sixty");
                break;
            case 70:
                numberName.append("seventy");
                break;
            case 80:
                numberName.append("eighty");
                break;
            case 90:
                numberName.append("ninety");
                break;
        }

        switch (ix % 10) {
            case 0:
                numberName.append("");
                break;
            case 1:
                numberName.append("one");
                break;
            case 2:
                numberName.append("two");
                break;
            case 3:
                numberName.append("three");
                break;
            case 4:
                numberName.append("four");
                break;
            case 5:
                numberName.append("five");
                break;
            case 6:
                numberName.append("six");
                break;
            case 7:
                numberName.append("seven");
                break;
            case 8:
                numberName.append("eight");
                break;
            case 9:
                numberName.append("nine");
                break;
        }

        return numberName.toString();
    }


    public static void main(String[] args) {

        //System.out.println(Arrays.toString(sort(new int[]{5, 2, 3, 4})));
        // System.out.println(Arrays.toString(sort(new int[]{20, 8, 9, 9, 10, 13})));
        System.out.println(Arrays.toString(sort(new int[]{20, 8, 9, 9, 656, 650})));


    }
}
