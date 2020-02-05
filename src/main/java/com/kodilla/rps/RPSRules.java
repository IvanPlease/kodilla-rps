package com.kodilla.rps;

public class RPSRules implements Rules{

    private static final int[][] rules = {
            { 0, 1, 2 },
            { 2, 0, 1 },
            { 1, 2, 0 }
    };

    @Override
    public int whoWin(int move1, int move2) {
        return rules[move1-1][move2-1];
    }

}
