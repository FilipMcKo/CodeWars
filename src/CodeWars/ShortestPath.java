package CodeWars;

import java.util.Arrays;

public class ShortestPath {


    public static String[] directions(String[] goal) {
        int x = 0;
        int y = 0;
        int size;
        for (String s : goal) {
            if (s == "N") y++;
            else if (s == "S") y--;
            else if (s == "E") x++;
            else if (s == "W") x--;
        }
        size = Math.abs(x) + Math.abs(y);
        if (size == 0) return new String[]{""};
        String[] newGoal = new String[size];
        for (int i = 0; i < size; i++) {
            if (y > 0) {
                newGoal[i] = "N";
                y--;
                continue;
            } else if (y < 0) {
                newGoal[i] = "S";
                y++;
                continue;
            } else if (x > 0) {
                newGoal[i] = "E";
                x--;
                continue;
            } else if (x < 0) {
                newGoal[i] = "W";
                x++;
                continue;
            } else
                newGoal[i] = "";

        }

        return newGoal;
    }


    public static void main(String[] args) {
        String[] goal1 = {"N", "N", "N", "N", "N", "E", "N", "N"};
        String[] goal2 = {"S", "S", "N", "E", "W", "S", "N"};
        String[] goal3 = {"N", "W", "S", "E"};
        String[] goal4 = {};

        //System.out.println(Arrays.deepToString(directions(goal1)));
        System.out.println(Arrays.deepToString(directions(goal2)));
        //System.out.println(Arrays.deepToString(directions(goal3)));
        //System.out.println(Arrays.deepToString(directions(goal4)));

    }
}
