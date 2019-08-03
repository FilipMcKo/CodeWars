package com.mucko.filip.codewars;

public class DeafRats {

    public static int countDeafRats(final String town) {

        String town2 = town.replaceAll(" ","");

        int deafRats = 0;

        int indexOfP = town2.indexOf('P');
        for (int i = 0; i <= indexOfP; i++) {
            if (i % 2 == 0 && town2.charAt(i) == 'O')
                deafRats++;
        }
        for (int i = indexOfP+1; i < town2.length(); i++) {
            if (i % 2 == 0 && town2.charAt(i) == 'O')
                deafRats++;
        }


        return deafRats;
    }


    public static void main(String[] args) {
        String town = "P O~ O~ ~O O~";
        countDeafRats(town);
    }

}
