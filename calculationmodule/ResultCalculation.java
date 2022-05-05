package tictactoe.calculationmodule;

import tictactoe.Main;

public class ResultCalculation {

    public int checkingPlayStatus(String playTable) {

        if (tryIfWon(playTable,'X')) {
            return 3;
        } else if (tryIfWon(playTable,'O')) {
            return 4;
        } else if (tryIfDraw(playTable)) {
            return 2;
        }
        return 1;
    }

    private boolean tryIfDraw(String playTable) {
        int X = 0;
        int O = 0;
        for (int i = 0; i < playTable.length(); i++) {
            if (playTable.charAt(i) == 'X') {
                X++;
            } else if (playTable.charAt(i) == 'O') {
                O++;
            }
        }
        if (X + O == playTable.length()) {
            return true;
        }
        return false;
    }

    private boolean tryIfWon(String playtable, char token) {
        for (int i = 0; i < 3; i++) {
            if (playtable.charAt(i * 3) == token && playtable.charAt(i * 3 + 1) == token && playtable.charAt(i * 3 + 2) == token) {
                return true;
            } else if (playtable.charAt(i) == token && playtable.charAt(i + 3) == token && playtable.charAt(i + 6) == token) {
                return true;
            }
        }
        if (playtable.charAt(0) == token && playtable.charAt(4) == token && playtable.charAt(8) == token) {
            return true;
        } else if (playtable.charAt(2) == token && playtable.charAt(4) == token && playtable.charAt(6) == token) {
            return true;
        }
        return false;
    }

    public String createActualTable(String playTable, int positonInPlayTableString, boolean playerIsX) {
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


}

