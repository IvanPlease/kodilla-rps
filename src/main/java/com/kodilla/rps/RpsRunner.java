package com.kodilla.rps;

import static com.kodilla.rps.IOController.*;

public class RpsRunner {

    public static void main(String[] args) {
        boolean end = false;
        do{
            GameController gameController = new GameController(new HumanPlayer(getName()), new ComputerPlayer(), getGameCount());
            showRules();
            gameController.playGame();
            if(afterGameQ() == 0){
                end = true;
            }
        }while(!end);
    }

}