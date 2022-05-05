package tictactoe.input;

import tictactoe.Main;

import java.util.Scanner;


import tictactoe.gamecontroller.GameController;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class ConsoleInput {

    private boolean keepScanning = true;
    private GameController currentGame;


    public void setKeepScanning(boolean keepScanning) {
        this.keepScanning = keepScanning;
    }

    public String scanForInput() {
        String input = "";
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            input = scanner.nextLine();
        }
        return input;
    }

    public String[] readStartingCommand() {

        boolean inputFalse = true;
        boolean[] falseInput = {true, true};
        String[] playerStatus = {"user", "easy", "medium"};
        String[] stringArr = new String[3];

        int inputCommand = 0;
        while (inputFalse) {
            Main.CONSOLE_VIEW.displayInputCommand();
            String string = scanForInput();
            stringArr = string.split(" ");
            if (stringArr.length == 3 && Objects.equals(stringArr[0], "start")) {
                for (String status : playerStatus) {
                    for (int i = 1; i < stringArr.length; i++) {
                        if (status.equals(stringArr[i])) {
                            falseInput[i - 1] = false;
                        }
                    }
                }
                inputFalse = !(!falseInput[0] && !falseInput[1]);
            } else if (stringArr.length == 1 && stringArr[0].equals("exit")) {
                inputFalse = false;
            } else {
                Main.CONSOLE_VIEW.displayBadParameters();
            }
        }
        return stringArr;
    }
}
