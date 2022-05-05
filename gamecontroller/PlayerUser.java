package tictactoe.gamecontroller;

import tictactoe.Main;

public class PlayerUser implements MoveCalculator{

    @Override
    public int selectField(String playTableString, boolean token) {

        String coordinates;
        Main.CONSOLE_VIEW.requestForMoveCoordintes();
        coordinates = Main.CONSOLE_INPUT.scanForInput();
        return Main.OTHER_CALCULATION.parseCoordinates(coordinates);
    }

    @Override
    public void requestStatement () {
        System.out.println("Enter the coordinates: ");
    }
}