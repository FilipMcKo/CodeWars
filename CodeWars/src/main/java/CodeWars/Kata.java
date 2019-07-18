package CodeWars;

public class Kata {

    public static String encrypt(final String text, final int n) {
        if (n <= 0 || text == "" || text == null) return text;
        StringBuilder stringBuilder = new StringBuilder();
        int m = n;
        for (int j = 1; j < text.length(); j += 2)
            stringBuilder.append(text.charAt(j));
        for (int j = 0; j < text.length(); j += 2)
            stringBuilder.append(text.charAt(j));

        String encrypted = stringBuilder.toString();
        m--;

        if (m > 0)
            return encrypt(encrypted, m);
        return encrypted;
    }

    public static String decrypt(final String encryptedText, final int n) {
        if (n <= 0 || encryptedText == "" || encryptedText == null) return encryptedText;
        StringBuilder stringBuilder = new StringBuilder();
        int m = n;
        for (int j = 0, i = encryptedText.length() / 2; j<encryptedText.length()/2 ; j++, i++) {
            stringBuilder.append(encryptedText.charAt(i));
            stringBuilder.append(encryptedText.charAt(j));
        }
        if(encryptedText.length()%2!=0) stringBuilder.append(encryptedText.charAt(encryptedText.length()-1));
        String decrypted = stringBuilder.toString();
        m--;

        if (m > 0)
            return decrypt(decrypted, m);
        return decrypted;
    }


    public static void main(String[] args) {
        System.out.println(encrypt("This is a test!", 2));
        System.out.println(decrypt("hsi  etTi sats!", 1));
    }


}