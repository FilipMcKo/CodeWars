package com.mucko.filip.codewars.Warrior;

import java.util.ArrayList;
import java.util.List;

public class Warrior {
    private int level;
    private int experience;
    private Rank rank;
    private String fightResult;
    private List<String> achievements;
    private static final int START_LEVEL = 1;
    private static final int MAX_LEVEL = 100;
    private static final int START_EXPERIENCE = 100;
    private static final int MAX_EXPERIENCE = 10000;
    private static final Rank[] ranks = Rank.values();

    public Warrior() {
        this.level = START_LEVEL;
        this.experience = START_EXPERIENCE;
        this.rank = getRankBasedOnLevel(this.level);
        this.achievements = new ArrayList<>();
    }

    public String battle(int opponentLevel) {
        if (worthyOpponent(opponentLevel)) {
            Rank opponentRank = getRankBasedOnLevel(opponentLevel);
            if (opponentLevel - this.level >= 5 && opponentRank.ordinal() > this.rank.ordinal()) {
                System.out.println(opponentRank.ordinal());
                System.out.println(this.rank.ordinal());
                return "You've been defeated";
            }
            addExperienceAndSetFightResult(opponentLevel);
            resetLevelAndRank();
            return fightResult;
        } else {
            return "Invalid level";
        }
    }

    public String training(String description, int experience, int minLevel) {
        if (this.level >= minLevel) {
            this.achievements.add(description);
            this.experience += experience;
            if (this.experience > MAX_EXPERIENCE) {
                this.experience = MAX_EXPERIENCE;
            }
            resetLevelAndRank();
            return description;
        } else {
            return "Not strong enough";
        }
    }

    public int level() {
        return level;
    }

    public int experience() {
        return experience;
    }

    public String rank() {
        return rank.description;
    }

    public List<String> achievements() {
        return achievements;
    }

    private int getLevelBasedOnExperience(int experience) {
        if (experience >= MAX_EXPERIENCE) {
            return MAX_LEVEL;
        }
        return experience / 100;
    }

    private Rank getRankBasedOnLevel(int level) {
        if (level >= MAX_LEVEL) {
            return ranks[10];
        }
        return ranks[level / 10];
    }

    private void resetLevelAndRank() {
        this.level = getLevelBasedOnExperience(this.experience);
        this.rank = getRankBasedOnLevel(this.level);
    }

    private boolean worthyOpponent(int opponentLevel) {
        if (opponentLevel < 1 || opponentLevel > 100) {
            return false;
        }
        return true;
    }

    private void addExperienceAndSetFightResult(int opponentLevel) {
        int difference = opponentLevel - this.level;
        if (difference == 0) {
            this.experience += 10;
            this.fightResult = "A good fight";
        } else if (difference == -1) {
            this.experience += 5;
            this.fightResult = "A good fight";
        } else if (difference < -1) {
            this.experience += 0;
            this.fightResult = "Easy fight";
        } else {
            this.experience += difference * difference * 20;
            this.fightResult = "An intense fight";
        }
        if (this.experience > MAX_EXPERIENCE) {
            this.experience = MAX_EXPERIENCE;
        }
    }
}
