package tictactoe.gamecontroller;

public class PlayerComputerMedium implements MoveCalculator{

    @Override
    public int selectField(String playTableString, boolean tokenX) {
        int sumX = 0;
        int sumY = 0;
        int temp = 10;
        int temp1 = 10;
        int temp2 = 10;
        char playerToken = 0;
        char otherToken = 0;
        int playerTokenInt = 10;
        int otherTokenInt = 1;
        int[][] playtable = new int[3][3];
        int counter = 0;
        if (tokenX) {
            playerToken ='X';
            otherToken = 'O';
        } else {
            playerToken = 'O';
            otherToken = 'X';
        }
  //      System.out.println(playTableString);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (playTableString.charAt(counter) == playerToken) {
                    playtable[i][j] = 10;
                } else if (playTableString.charAt(counter) == otherToken) {
                    playtable[i][j] = 1;
                } else {
                    playtable[i][j] = 0;
                }
                counter++;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumX += playtable[i][j];
                sumY += playtable[j][i];
            }
            if ((sumX == 20)) {
                for (int j = 0; j < 3; j++) {
                    if (playtable[i][j] == 0) {
                        temp1 = (3 * i + j + 1);
                    }
                }
            } else if ((sumY == 20)) {
                for (int j = 0; j < 3; j++) {
                    if (playtable[j][i] == 0) {
                        temp1 = (3 * j + i + 1 );
                    }
                }
            } else if ((sumX == 2)) {
                for (int j = 0; j < 3; j++) {
                    if (playtable[i][j] == 0) {
                        temp2 = (3 * i + j + 1);
                    }
                }
            } else if ((sumY == 2)) {
                for (int j = 0; j < 3; j++) {
                    if (playtable[j][i] == 0) {
                        temp2 = (3 * j + i + 1);
                    }
                }
            } else if (playtable[0][0] == playtable[2][2] && playtable[0][0] == playerTokenInt && playtable[1][1] != otherTokenInt) {
                temp1 = 5;
            } else if (playtable[0][0] == playtable[1][1] && playtable[0][0] == playerTokenInt && playtable[2][2] != otherTokenInt) {
                temp1 = 9;
            } else if (playtable[1][1] == playtable[2][2] && playtable[1][1] == playerTokenInt && playtable[0][0] != otherTokenInt) {
                temp1 = 1;
            } else if (playtable[0][2] == playtable[1][1] && playtable[0][2] == playerTokenInt && playtable[2][0] != otherTokenInt) {
                temp1 = 7;
            } else if (playtable[0][2] == playtable[2][0] && playtable[0][2] == playerTokenInt && playtable[1][1] != otherTokenInt) {
                temp1 = 5;
            } else if (playtable[1][1] == playtable[2][0] && playtable[2][0] == playerTokenInt && playtable[0][2] != otherTokenInt) {
                temp1 = 3;
            }
            else if (playtable[0][0] == playtable[2][2] && playtable[0][0] == otherTokenInt && playtable[1][1] != playerTokenInt) {
                temp2 = 5;
            } else if (playtable[0][0] == playtable[1][1] && playtable[0][0] == otherTokenInt && playtable[2][2] != playerTokenInt) {
                temp2 = 9;
            } else if (playtable[1][1] == playtable[2][2] && playtable[1][1] == otherTokenInt && playtable[0][0] != playerTokenInt) {
                temp2 = 1;
            } else if (playtable[0][2] == playtable[1][1] && playtable[0][2] == otherTokenInt && playtable[2][0] != playerTokenInt) {
                temp2 = 7;
            } else if (playtable[0][2] == playtable[2][0] && playtable[0][2] == otherTokenInt && playtable[1][1] != playerTokenInt) {
                temp2 = 5;
            } else if (playtable[1][1] == playtable[2][0] && playtable[2][0] == otherTokenInt && playtable[0][2] != playerTokenInt) {
                temp2 = 3;
            }
            if (temp1 != 10) {
                temp = temp1;
            } else if (temp2 != 10) {
                temp = temp2;
            }
            sumX = 0;
            sumY = 0;
        }
        if (temp == 10) {
            MoveCalculator player3 = new PlayerComputerEasy();
            temp = player3.selectField(playTableString, tokenX);
        }
        return temp;
    }

    @Override
    public void requestStatement () {
        System.out.println("Making move level \"medium\"");
    }
}

