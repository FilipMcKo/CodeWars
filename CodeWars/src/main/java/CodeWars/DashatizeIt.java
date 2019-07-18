package CodeWars;

public class DashatizeIt {

    public static String dashatize(int num) {

        String numm = String.valueOf(num);
        numm = numm.replace("-", "");
        StringBuilder stringBuilder = new StringBuilder();
        if (numm.charAt(0) % 2 != 0) {
            stringBuilder.append(numm.charAt(0));
            stringBuilder.append('-');
        } else stringBuilder.append(numm.charAt(0));
        if (numm.length() > 1) {
            for (int i = 1; i < numm.length() - 1; i++) {
                if (numm.charAt(i) % 2 != 0) {
                    stringBuilder.append('-');
                    stringBuilder.append(numm.charAt(i));
                    stringBuilder.append('-');
                } else stringBuilder.append(numm.charAt(i));

            }
            if (numm.charAt(numm.length() - 1) % 2 != 0) {
                stringBuilder.append('-');
                stringBuilder.append(numm.charAt(numm.length() - 1));
            } else stringBuilder.append(numm.charAt(numm.length() - 1));
        }
        if (stringBuilder.charAt(stringBuilder.length() - 1) == '-')
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        for (int i = 1; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i - 1) == '-' && stringBuilder.charAt(i) == '-') stringBuilder.deleteCharAt(i);
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(dashatize(-1));
    }

}
