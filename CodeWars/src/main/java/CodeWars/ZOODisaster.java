package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZOODisaster {

    public static String[] whoEatsWho(final String zoo) {

        String[] zoos = zoo.split(",");

        List<String> listOfMeals = new ArrayList<>();
        listOfMeals.add("antelope eats grass");
        listOfMeals.add("big-fish eats little-fish");
        listOfMeals.add("bug eats leaves");
        listOfMeals.add("bear eats big-fish");
        listOfMeals.add("bear eats bug");
        listOfMeals.add("bear eats chicken");
        listOfMeals.add("bear eats cow");
        listOfMeals.add("bear eats leaves");
        listOfMeals.add("bear eats sheep");
        listOfMeals.add("chicken eats bug");
        listOfMeals.add("cow eats grass");
        listOfMeals.add("fox eats chicken");
        listOfMeals.add("fox eats sheep");
        listOfMeals.add("giraffe eats leaves");
        listOfMeals.add("lion eats antelope");
        listOfMeals.add("lion eats cow");
        listOfMeals.add("panda eats leaves");
        listOfMeals.add("sheep eats grass");

        ArrayList<String> inputZoo = new ArrayList<>();
        inputZoo.add("nothing");
        inputZoo.addAll(Arrays.asList(zoos));
        inputZoo.add("nothing");

        ArrayList<String> whatHappensInZoo = new ArrayList<>();

        /**
         * Before the while-loop the current state of the zoo is added
         */
        whatHappensInZoo.add(zoo);

        boolean anythingToEat = true;
        while (anythingToEat) {

            /**
             * First the left side is checked and if there is no food-chain, the right side is checked
             * After 2 if's (whether the instructions inside them are completed or not) the for-loop iterates
             */
            for (int i = 1; i < inputZoo.size() - 1; i++) {
                if (listOfMeals.contains(inputZoo.get(i) + " eats " + inputZoo.get(i - 1))) {
                    whatHappensInZoo.add(inputZoo.get(i) + " eats " + inputZoo.get(i - 1));
                    inputZoo.remove(i - 1);
                    break;
                } else if (listOfMeals.contains(inputZoo.get(i) + " eats " + inputZoo.get(i + 1))) {
                    whatHappensInZoo.add(inputZoo.get(i) + " eats " + inputZoo.get(i + 1));
                    inputZoo.remove(i + 1);
                    break;
                }
            }

            /**
             * Not the validation for-loop is constructed. The initial value of @anythingToEat = false
             * if the conditions inside the loop are met the value is changed
             */
            anythingToEat = false;
            for (int i = 1; i < inputZoo.size() - 1; i++) {
                if (listOfMeals.contains(inputZoo.get(i) + " eats " + inputZoo.get(i - 1))
                        || listOfMeals.contains(inputZoo.get(i) + " eats " + inputZoo.get(i + 1))) {
                    anythingToEat = true;
                    break;
                }
            }
        }

        /**
         * After the while-loop the current state of the zoo is added
         */
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < inputZoo.size() - 1; i++) {
            stringBuilder.append(inputZoo.get(i));
            if (i != inputZoo.size() - 2) stringBuilder.append(",");
        }
        whatHappensInZoo.add(stringBuilder.toString());


        String[] whatHappenedInZoo = new String[whatHappensInZoo.size()];

        for (int i = 0; i < whatHappenedInZoo.length; i++)
            whatHappenedInZoo[i] = whatHappensInZoo.get(i);

        return whatHappenedInZoo;
    }

    public static void main(String[] args) {
        String zoo = "fox,bug,chicken,grass,sheep";
        String zoo1 = "fox,fox,fox,fox,fox";
        String zoo2 = "leaves,grass,little-fish,grass";
        String zoo3 = "sheep,busker,cow,sheep,busker,cow";
        String zoo4 = "chicken,lion,giraffe,busker,fox,chicken,busker";
        //System.out.println(Arrays.toString(whoEatsWho(zoo)));
        //System.out.println(Arrays.toString(whoEatsWho(zoo1)));
        //System.out.println(Arrays.toString(whoEatsWho(zoo2)));
        //System.out.println(Arrays.toString(whoEatsWho(zoo3)));
        //System.out.println((whoEatsWho(zoo3).length));
        System.out.println(Arrays.toString(whoEatsWho(zoo4)));
        System.out.println((whoEatsWho(zoo4).length));
    }

}
