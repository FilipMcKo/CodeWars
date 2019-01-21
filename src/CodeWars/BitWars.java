package CodeWars;

public class BitWars {

    public static String bitsWar(int[] numbers) {
        int even = 0;
        int odd = 0;
        String binary;

        for (int number : numbers) {
            if (number == 0) continue;
            if (number % 2 == 0) {
                if (number > 0) {
                    binary = Integer.toBinaryString(number);
                    for (int i = 0; i < binary.length(); i++) {
                        if (binary.charAt(i) == '1') even++;
                    }
                } else {
                    binary = Integer.toBinaryString(Math.abs(number));
                    for (int i = 0; i < binary.length(); i++) {
                        if (binary.charAt(i) == '1') even--;
                    }
                }
            }
            else{
                if (number > 0) {
                    binary = Integer.toBinaryString(number);
                    for (int i = 0; i < binary.length(); i++) {
                        if (binary.charAt(i) == '1') odd++;
                    }
                } else {
                    binary = Integer.toBinaryString(Math.abs(number));
                    for (int i = 0; i < binary.length(); i++) {
                        if (binary.charAt(i) == '1') odd--;
                    }
                }
            }

        }

        if (odd > even) return "odds win";
        else if (even > odd) return "evens win";
        return "tie";

    }


    public static void main(String[] args) {
        System.out.println(bitsWar(new int[]{7,-3,20}));
    }
}
