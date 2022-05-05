package tictactoe.calculationmodule;

public class OtherCalculation {

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





}
