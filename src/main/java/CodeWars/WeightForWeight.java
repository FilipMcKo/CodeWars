package CodeWars;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class WeightForWeight {

    public static String orderWeight(String strng) {
        List<String> weights = Arrays.asList(strng.split(" "));
        weights.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int o1sum = 0;
                int o2sum = 0;
                for (int i = 0; i < o1.length(); i++) o1sum += (int) o1.charAt(i) - 48;
                for (int i = 0; i < o2.length(); i++) o2sum += (int) o2.charAt(i) - 48;
                if (o1sum == o2sum) {
                    int len1 = o1.length();
                    int len2 = o2.length();
                    int lim = Math.min(len1, len2);
                    char v1[] = o1.toCharArray();
                    char v2[] = o2.toCharArray();

                    int k = 0;
                    while (k < lim) {
                        char c1 = v1[k];
                        char c2 = v2[k];
                        if (c1 != c2) {
                            return c1 - c2;
                        }
                        k++;
                    }
                    return len1 - len2;
                }
                if (o1sum < o2sum) return -1;
                return 1;
            }
        });
        StringBuilder stringBuilder = new StringBuilder();
        for (String weight : weights) {
            stringBuilder.append(weight + " ");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
    }
}
