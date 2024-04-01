package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        if (sideLength <= 0) {
        //    System.out.println("Invalid side length.");
            return;
        }

        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if (i == sideLength / 2 || j == sideLength / 2) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Cross cross = new Cross();
        cross.printCross(5);
    }
}

