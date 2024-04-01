package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height) {
        if (length <= 0 || height <= 0) {
            return;
        }

        // Print top side
        for (int i = 0; i < length; i++) {
            System.out.print("8");
        }
        System.out.println();

        // Print middle part
        for (int i = 0; i < height - 2; i++) {
            System.out.print("8");
            for (int j = 0; j < length - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("8");
        }

        // Print bottom side
        if (height > 1) {
            for (int i = 0; i < length; i++) {
                System.out.print("8");
            }
        }
        System.out.println();
    }
}
