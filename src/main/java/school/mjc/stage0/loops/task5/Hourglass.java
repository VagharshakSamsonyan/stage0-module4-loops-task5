package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        // Print upper half of hourglass
        for (int i = height; i >= 1; i--) {
            printRow(height, i);
        }

        // Print lower half of hourglass
        for (int i = 2; i <= height; i++) {
            printRow(height, i);
        }
    }

    private void printRow(int height, int currentRow) {
        int numSpaces = height - currentRow; // Calculate the number of leading spaces
        int numEights = 2 * currentRow - 1;  // Calculate the number of '8's

        // Print leading spaces
        for (int i = 0; i < numSpaces; i++) {
            System.out.print(" ");
        }

        // Print '8's
        for (int i = 0; i < numEights; i++) {
            System.out.print("8");
        }

        // Move to the next line
        System.out.println();
    }
}
