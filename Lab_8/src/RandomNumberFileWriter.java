import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class RandomNumberFileWriter {
    private final Random random;

    public RandomNumberFileWriter() {
        this.random = new Random();
    }

    public void writeRandomNumbers(File file, int minValue, int maxValue, int count) throws IOException {
        FileHelper.createFileIfNotExists(file);

        try (FileWriter writer = new FileWriter(file, false)) {
            for (int i = 0; i < count; i++) {
                int number = random.nextInt(maxValue - minValue + 1) + minValue;
                writer.write(Integer.toString(number));

                if (i < count - 1) {
                    writer.write(" ");
                }

                if ((i + 1) % 10 == 0) {
                    writer.write(System.lineSeparator());
                }
            }
        }
    }
}
