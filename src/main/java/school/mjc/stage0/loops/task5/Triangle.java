package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= i; j++) {
                builder.append("8");
            }
            builder.append(System.lineSeparator());
        }
        System.out.print(builder.toString());
    }
}
