package com.mucko.filip.codewars;

public class PigLatin {
    public static String pigIt(String str) {

        String[] words = str.split(" ");
        StringBuilder pigWords = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if((int)words[i].toLowerCase().charAt(0)>96){
            pigWords = pigWords.append(words[i], 1, words[i].length())
                    .append(words[i].charAt(0)).append("ay");}
            else{
                pigWords.append(words[i].charAt(0));
            }
            pigWords.append(" ");
        }
        pigWords.deleteCharAt(pigWords.length()-1);

        return pigWords.toString();
    }


    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool"));
        System.out.println(pigIt("Hello world !"));
    }
}
