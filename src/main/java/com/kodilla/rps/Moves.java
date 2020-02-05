package com.kodilla.rps;

import java.util.HashMap;
import java.util.Map;

public enum Moves{
    PAPIER(0),
    KAMIEN(1),
    NOZYCZKI(2);

    private int value;
    private static Map map = new HashMap<>();

    Moves(int newValue) {
        this.value = newValue;
    }

    static {
        for (Moves pageType : Moves.values()) {
            map.put(pageType.value, pageType);
        }
    }

    public static Moves valueOf(int pageType) {
        return (Moves) map.get(pageType);
    }

    public int getValue() {
        return value;
    }

}