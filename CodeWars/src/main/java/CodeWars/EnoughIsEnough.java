package CodeWars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        if(maxOccurrences==0) return new int[0];
        int size = 0;
        HashMap<Integer, Integer> mapka = new HashMap<>();
        for (int i = 0; i < elements.length; i++) {
            if (mapka.containsKey(elements[i])) {
                if (mapka.get(elements[i]) < maxOccurrences) {
                    mapka.replace(elements[i], (mapka.get(elements[i])) + 1);
                    size++;
                }
            } else {mapka.put(elements[i], 1); size++;}
        }


        int[] newArr = new int[size];

        for(int i = 0, j = 0; i<elements.length; i++){
            if(mapka.containsKey(elements[i])){
                mapka.replace(elements[i], (mapka.get(elements[i])) - 1);
                newArr[j]=elements[i];
                j++;
            }

            if(mapka.containsKey(elements[i])&&mapka.get(elements[i])==0) mapka.remove(elements[i]);
        }

        return newArr;
    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(deleteNth(new int[] {20,37,20,21}, 0)));

    }

}
