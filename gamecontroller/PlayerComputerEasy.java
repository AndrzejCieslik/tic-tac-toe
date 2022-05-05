package tictactoe.gamecontroller;

import java.util.Random;

public class PlayerComputerEasy implements MoveCalculator{

    @Override
    public int selectField(String playTableString, boolean token) {
        int positonInPlayTableString;
        Random random = new Random();
        positonInPlayTableString = random.nextInt(9) + 1;
        return positonInPlayTableString;
    }
    @Override
    public void requestStatement () {
        System.out.println("Making move level \"easy\"");
    }
}
