package tictactoe;

import tictactoe.calculationmodule.OtherCalculation;
import tictactoe.calculationmodule.ResultCalculation;
import tictactoe.gamecontroller.GameController;
import tictactoe.input.ConsoleInput;
import tictactoe.view.ConsoleView;

public class Main {

    public static final ConsoleInput CONSOLE_INPUT = new ConsoleInput();
    public static final ConsoleView CONSOLE_VIEW = new ConsoleView();
    public static final GameController GAME_CONTROLLER = new GameController();
    public static final ResultCalculation RESULT_CALCULATION = new ResultCalculation();
    public static final OtherCalculation OTHER_CALCULATION = new OtherCalculation();


    public static void main(String[] args) {
        Main.GAME_CONTROLLER.handleInput();


    }
}
