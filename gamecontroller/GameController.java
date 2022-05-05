package tictactoe.gamecontroller;

import tictactoe.Main;

import java.util.Objects;

public class GameController {

    private String[] playTable;
    private String playTableString = "_________";
    MoveCalculator player1;
    MoveCalculator player2;
    boolean playEnd = false;
    boolean endGame = false;
    boolean repeatPlayer = false;
    boolean playerNr1 = true;
    int positionInPlayTableString;
    int gameResult;


    public void handleInput() {

        while (!endGame) {
            playerNr1 = true;
            repeatPlayer = false;
            playTableString = "_________";
            playEnd = false;
            gameResult = 0;
            String[] inputArr = Main.CONSOLE_INPUT.readStartingCommand();
            if (Objects.equals(inputArr[0], "exit")) {
                playEnd = true;
                endGame = true;
            }
            if (Objects.equals(inputArr[0], "start")) {
                switch (inputArr[1]) {
                    case "user":
                        player1 = new PlayerUser();
                        break;
                    case "easy":
                        player1 = new PlayerComputerEasy();
                        break;
                    case "medium":
                        player1 = new PlayerComputerMedium();
                        break;
                }
                switch (inputArr[2]) {
                    case "user" : player2 = new PlayerUser();break;
                    case "easy" : player2 = new PlayerComputerEasy();break;
                    case "medium" : player2 = new PlayerComputerMedium();break;
                }
                Main.CONSOLE_VIEW.printPlayTable(playTableString);
            }
            while (!playEnd) {
                if (playerNr1) {
                    positionInPlayTableString = player1.selectField(playTableString, playerNr1);
                } else {
                    positionInPlayTableString = player2.selectField(playTableString, playerNr1);
                }
                repeatPlayer = checkIfPlaceEmpty(playTableString, positionInPlayTableString);
    //            System.out.println(repeatPlayer);
                if (!repeatPlayer) {
                    playTableString = Main.RESULT_CALCULATION.createActualTable(playTableString, positionInPlayTableString, playerNr1);
                    if (playerNr1) {
                        if (!inputArr[1].equals("user")) {
                            player1.requestStatement();
                        }
                    } else if (!inputArr[2].equals("user")) {
                        player2.requestStatement();
                    }
                    Main.CONSOLE_VIEW.printPlayTable(playTableString);
                    gameResult = Main.RESULT_CALCULATION.checkingPlayStatus(playTableString);

                    switch (gameResult) {
                        case 1:
                            //            Main.CONSOLE_VIEW.gameStatesNotFinished();
                            break;
                        case 2:
                            Main.CONSOLE_VIEW.gameStatesDraw();
                            playEnd = true;
                            break;
                        case 3:
                            Main.CONSOLE_VIEW.gameStatesXwins();
                            playEnd = true;
                            break;
                        case 4:
                            Main.CONSOLE_VIEW.gameStatesOwins();
                            playEnd = true;
                            break;
                        case 5:
                            playEnd = true;
                            break;
                        default:
                    }
                    playerNr1 = !playerNr1;
                }
            }
        }
        Main.CONSOLE_INPUT.setKeepScanning(false);
    }

    private boolean checkIfPlaceEmpty(String playTable, int positonInPlayTableString) {

        return !(playTable.charAt(positonInPlayTableString - 1) != 'X' && playTable.charAt(positonInPlayTableString - 1) != 'O');
    }

}
