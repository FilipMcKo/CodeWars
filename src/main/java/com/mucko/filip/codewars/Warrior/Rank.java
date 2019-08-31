package com.mucko.filip.codewars.Warrior;

public enum Rank {

    PUSHOVER("Pushover"),
    NOVICE("Novice"),
    FIGHTER("Fighter"),
    WARRIOR("Warrior"),
    VETERAN("Veteran"),
    SAGE("Sage"),
    ELITE("Elite"),
    CONQUEROR("Conqueror"),
    CHAMPION("Champion"),
    MASTER("Master"),
    GREATEST("Greatest");

    private String description;

    Rank(String description) {
        this.description = description;
    }
}
