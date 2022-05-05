package tictactoe.gamecontroller;
/*
import tictactoe.Main;

public class GameInputPreparationTwo {

    String playTable = "_________";
    int positonInPlayTableString;
    boolean playerIsX;
    int playStatus = 0;
    boolean playerOne = true;
    boolean computerPlayer = true;

    public void handleInput() {

        int inputCommand = Main.CONSOLE_INPUT.readStartingCommand();
        Main.CONSOLE_VIEW.printPlayTable(playTable);
        while (playStatus != 10) {
            if (playStatus == 2 || playStatus == 3 || playStatus == 4) {
                playTable = "_________";
                playStatus = 0;
                playerOne = true;
                inputCommand = Main.CONSOLE_INPUT.readStartingCommand();
                if (inputCommand != 1) {
                    Main.CONSOLE_VIEW.printPlayTable(playTable);
                }
            }
            if (inputCommand == 1) {
                playStatus = 10;
                Main.CONSOLE_INPUT.setKeepSkaning(false);
                break;
            } else {
                switch (inputCommand) {
                    case 2: {
                        positonInPlayTableString = Main.COMPUTER_MODE.playComputerModeEasy();
                        if (playerOne) {
                            playerIsX = true;
                            playerOne = false;
                            computerPlayer = true;
                        } else {
                            playerIsX = false;
                            playerOne = true;
                            computerPlayer = true;
                        }
                    }
                    break;
                    case 3: {
                        if (playerOne) {
                            positonInPlayTableString = Main.COMPUTER_MODE.playComputerModeEasy(playTable,'X');
                            playerIsX = true;
                            playerOne = false;
                            computerPlayer = true;
                        } else {
                            positonInPlayTableString = Main.COMPUTER_MODE.playUser();
                            playerIsX = false;
                            playerOne = true;
                            computerPlayer = false;
                        }
                    }
                    break;
                    case 4: {
                        if (playerOne) {
                            positonInPlayTableString = Main.COMPUTER_MODE.playUser();
                            playerIsX = true;
                            playerOne = false;
                            computerPlayer = false;
                        } else {
                            positonInPlayTableString = Main.COMPUTER_MODE.playComputerModeEasy(playTable,'O');
                            playerIsX = false;
                            playerOne = true;
                            computerPlayer = true;
                        }
                    }
                    break;
                    case 5: {
                        positonInPlayTableString = Main.COMPUTER_MODE.playUser();
                        if (playerOne) {
                            playerIsX = true;
                            playerOne = false;
                            computerPlayer = false;
                        } else {
                            playerIsX = false;
                            playerOne = true;
                            computerPlayer = false;
                        }
                    }
                    break;
                }
                if (positonInPlayTableString == 10) {
                    Main.CONSOLE_VIEW.messageCoordinatesShouldBe0To3();
                } else if (positonInPlayTableString == 11) {
                    Main.CONSOLE_VIEW.messageShouldBeNumbers();
                } else if (ifPlaceEmpty(playTable, positonInPlayTableString)) {
                    playTable = createActualTable(playTable, positonInPlayTableString, playerIsX);
                    if (computerPlayer) {
                        Main.CONSOLE_VIEW.statementLevelEasy();
                    }
                    Main.CONSOLE_VIEW.printPlayTable(playTable);
                    playStatus = Main.RESULT_CALCULATION.checkingPlayStatus(playTable);
                    switch (playStatus) {
                        case 1:
                            break;
                        case 2:
                            Main.CONSOLE_VIEW.gameStatesDraw();
                            break;
                        case 3:
                            Main.CONSOLE_VIEW.gameStatesXwins();
                            break;
                        case 4:
                            Main.CONSOLE_VIEW.gameStatesOwins();
                            break;
                    }
                } else {
                    if (!computerPlayer) {
                        Main.CONSOLE_VIEW.messageCellOcupied();
                    }
                    if (playerOne) {
                        playerOne = false;
                    } else {
                        playerOne = true;
                    }
                }
            }
        }
    }

    public int parseCoordinates(String moveCoordinates) {
        String[] coordinatesString = moveCoordinates.split(" ");
        int[] coordinates = new int[coordinatesString.length];
        if (moveCoordinates.charAt(0) >= '0' && moveCoordinates.charAt(0) <= '9' && moveCoordinates.charAt(2) >= '0' && moveCoordinates.charAt(2) <= '9') {
            coordinates[0] = Integer.parseInt(coordinatesString[0]);
            coordinates[1] = Integer.parseInt(coordinatesString[1]);
            if (coordinates[0] > 0 && coordinates[0] < 4 && coordinates[1] > 0 && coordinates[1] < 4) {
                return ((coordinates[0]) - 1) * 3 + coordinates[1];
            } else {
                return 10;
            }
        }
        return 11;
    }


    private boolean ifPlaceEmpty(String playTable, int positonInPlayTableString) {

        return playTable.charAt(positonInPlayTableString - 1) != 'X' && playTable.charAt(positonInPlayTableString - 1) != 'O';
    }

    private String createActualTable(String playTable, int positonInPlayTableString, boolean playerIsX) {
        String toReplace = "";
        StringBuilder stringBuilder = new StringBuilder(playTable);
        if (playerIsX) {
            toReplace = "X";
        } else {
            toReplace = "O";
        }
        stringBuilder.replace(positonInPlayTableString - 1, positonInPlayTableString, toReplace);
        playTable = String.valueOf(stringBuilder);
        return playTable;
    }

    private boolean checkIfPlayerPlaysX(String playTable) {
        int X = 0;
        int O = 0;
        for (int i = 0; i < playTable.length(); i++) {
            if (playTable.charAt(i) == 'X') {
                X++;
            } else if (playTable.charAt(i) == 'O') {
                O++;
            }
        }
        if (X == O) {
            return true;
        }
        return false;
    }
}
*/