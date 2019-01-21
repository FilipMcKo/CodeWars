package CodeWars;

import java.util.ArrayList;

public class ExpandedNumber {

    public static String expandedForm(int num) {
        ArrayList<Integer> digits = new ArrayList<>();
        int multiply = 1;
        while (num > 0) {
            digits.add((num % 10)*multiply);
            num /= 10;
            multiply *= 10;
        }
        String s = digits.get(digits.size()-1).toString();
        for (int i = digits.size()-2; i >= 0; i--) {
            if(digits.get(i)!=0) {
                s = s.concat(" + ");
                s = s.concat(digits.get(i).toString());
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(expandedForm(6055));

    }

}
