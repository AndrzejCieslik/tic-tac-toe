package tictactoe.view;


public class ConsoleView {

    public void requestForInitialState() {
        System.out.println("Enter the cells: ");
    }

    public void requestForMoveCoordintes() {
        System.out.println("Enter the coordinates: ");
    }

    public void statementLevelEasy() {
        System.out.println("Making move level \"easy\"");
    }

    public void messageCellOcupied() {
        System.out.println("This cell is occupied! Choose another one!");
    }

    public void messageShouldBeNumbers() {
        System.out.println("You should enter numbers!");
    }

    public void messageCoordinatesShouldBe0To3() {
        System.out.println("Coordinates should be from 1 to 3!");
    }

    public void gameStatesNotFinished() {
        System.out.println("Game not finished");
    }

    public void gameStatesDraw() {
        System.out.println("Draw");
    }

    public void gameStatesXwins() {
        System.out.println("X wins");
    }

    public void gameStatesOwins() {
        System.out.println("O wins");
    }

    public void displayInputCommand() {
        System.out.println("Input command:");
    }

    public void displayBadParameters() {
        System.out.println("Bad parameters!");
    }

    public void printPlayTable(String input) {
        String inputAfterRemove = input.replace('_',' ');
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(inputAfterRemove.charAt(i * 3 + j) + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }

}
