package com.kodilla.rps;

import static com.kodilla.rps.IOController.afterRoundRespond;
import static com.kodilla.rps.IOController.pickWinner;
import static com.kodilla.rps.IOController.checkState;

public class GameController{

    private Player player1;
    private Player player2;
    private int gameCount;
    private RPSRules rules = new RPSRules();

    public GameController(Player player1, Player player2, int gameCount){
        this.player1 = player1;
        this.player2 = player2;
        this.gameCount = gameCount;
    }

    public void playGame(){
        boolean end = false;
        while(!end){
            int winNr = rules.whoWin(player1.getMove(), player2.getMove());

            switch(winNr){
                case 0:
                    afterRoundRespond(null);
                    break;
                case 1:
                    player1.addPoint();
                    afterRoundRespond(player1);
                    break;
                case 2:
                    player2.addPoint();
                    afterRoundRespond(player2);
                    break;
            }

            if(player1.getPoints() == gameCount){
                end = true;
                pickWinner(player1);
            }else if(player2.getPoints() == gameCount){
                end = true;
                pickWinner(player2);
            }

            checkState(player1, player2);
        }
    }

}
