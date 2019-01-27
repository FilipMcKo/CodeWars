package CodeWars;

/**
 *
 * ROZWIAZANIA OK ALE PRZEKROCZYLEM CZAS NA CODEWARS
 *
 */

public class NextBiggerNumber {
    static int zero, one, two, three, four, five, six, seven, eight, nine;

    static long nextBiggerNumber2(long n) {
        long nModulo10 = n % 10;
        long nModulo100 = n % 100;
        long m = n - nModulo100 + nModulo10 * 10 + (nModulo100 - nModulo10) / 10;
        if (m > n) return m;

        zero = one = two = three = four = five = six = seven = eight = nine = 0;
        long tmp = n;
        int length = String.valueOf(n).length();
        char[] number1 = String.valueOf(n).toCharArray();
        for (char c : number1) {
            switch (c) {
                case '0':
                    zero++;
                    break;
                case '1':
                    one++;
                    break;
                case '2':
                    two++;
                    break;
                case '3':
                    three++;
                    break;
                case '4':
                    four++;
                    break;
                case '5':
                    five++;
                    break;
                case '6':
                    six++;
                    break;
                case '7':
                    seven++;
                    break;
                case '8':
                    eight++;
                    break;
                case '9':
                    nine++;
                    break;
            }
        }
        while (String.valueOf(tmp).length() == length) {
            tmp += 1;
            if (sameDigits(tmp)) {
                return tmp;
            }
        }

        return -1;
    }

    static boolean sameDigits(long tmp) {

        char[] number2 = String.valueOf(tmp).toCharArray();
        if ((zero + one + two + three + four + five + six + seven + eight + nine) != number2.length) return false;

        int zero1 = zero;
        int one1 = one;
        int two1 = two;
        int three1 = three;
        int four1 = four;
        int five1 = five;
        int six1 = six;
        int seven1 = seven;
        int eight1 = eight;
        int nine1 = nine;

        for (char c : number2) {
            switch (c) {
                case '0':
                    zero1--;
                    break;
                case '1':
                    one1--;
                    break;
                case '2':
                    two1--;
                    break;
                case '3':
                    three1--;
                    break;
                case '4':
                    four1--;
                    break;
                case '5':
                    five1--;
                    break;
                case '6':
                    six1--;
                    break;
                case '7':
                    seven1--;
                    break;
                case '8':
                    eight1--;
                    break;
                case '9':
                    nine1--;
                    break;
            }
        }
        return (zero1 == 0 && one1 == 0 && two1 == 0 && three1 == 0 && four1 == 0
                && five1 == 0 && six1 == 0 && seven1 == 0 && eight1 == 0 && nine1 == 0);
    }

    static long nextBiggerNumberBasic(long n) {
        zero = one = two = three = four = five = six = seven = eight = nine = 0;
        long tmp = n;
        int length = String.valueOf(n).length();
        char[] number1 = String.valueOf(n).toCharArray();
        for (char c : number1) {
            switch (c) {
                case '0':
                    zero++;
                    break;
                case '1':
                    one++;
                    break;
                case '2':
                    two++;
                    break;
                case '3':
                    three++;
                    break;
                case '4':
                    four++;
                    break;
                case '5':
                    five++;
                    break;
                case '6':
                    six++;
                    break;
                case '7':
                    seven++;
                    break;
                case '8':
                    eight++;
                    break;
                case '9':
                    nine++;
                    break;
            }
        }
        while (String.valueOf(tmp).length() == length) {
            tmp += 1;
            if (sameDigits(tmp)) {
                return tmp;
            }
        }

        return -1;
    }

    static long nextBiggerNumber(long n) {

        zero = one = two = three = four = five = six = seven = eight = nine = 0;
        long tmp = n;
        int length = String.valueOf(n).length();
        char[] number1 = String.valueOf(n).toCharArray();
        for (char c : number1) {
            switch (c) {
                case '0':
                    zero++;
                    break;
                case '1':
                    one++;
                    break;
                case '2':
                    two++;
                    break;
                case '3':
                    three++;
                    break;
                case '4':
                    four++;
                    break;
                case '5':
                    five++;
                    break;
                case '6':
                    six++;
                    break;
                case '7':
                    seven++;
                    break;
                case '8':
                    eight++;
                    break;
                case '9':
                    nine++;
                    break;
            }
        }
        while (String.valueOf(tmp).length() == length) {
            tmp += 1;
            if (sameDigits(tmp)) {
                return tmp;
            }
        }

        return -1;
    }

}
