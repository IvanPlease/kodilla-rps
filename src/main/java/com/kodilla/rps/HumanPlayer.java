package com.kodilla.rps;

import static com.kodilla.rps.IOController.moveInfo;

public class HumanPlayer extends Player {

    public HumanPlayer(String name){
        super(name);
    }

    @Override
    public int getMove() {
        int move = IOController.getMove();
        moveInfo(this.getName(), Moves.valueOf(move-1));
        return move;
    }

}
