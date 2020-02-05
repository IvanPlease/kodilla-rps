package com.kodilla.rps;

import java.util.Random;

import static com.kodilla.rps.IOController.moveInfo;

public class ComputerPlayer extends Player {

    private Random random = new Random();

    public ComputerPlayer(){
        super("Computer");
    }

    @Override
    public int getMove() {
        int move = random.nextInt(3) + 1;
        moveInfo(this.getName(), Moves.valueOf(move-1));
        return move;
    }

}
