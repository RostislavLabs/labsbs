import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Lab8 {

    public static void main(String[] args) {

        if (args.length < 3) {
            System.out.println("Використання: java Lab8 filename b1 b2");
            return;
        }

        String fileName = args[0];
        int b1 = Integer.parseInt(args[1]);
        int b2 = Integer.parseInt(args[2]);

        Random random = new Random();

        try {

            File file = new File(fileName);

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter writer = new FileWriter(file);

            for (int i = 0; i < 10; i++) {
                int number = random.nextInt(b2 - b1 + 1) + b1;
                writer.write(number + " ");
            }

            writer.close();

            System.out.println("Числа записані у файл\n");

            FileReader reader = new FileReader(file);

            int symbol;
            System.out.println("Вміст файлу:");

            while ((symbol = reader.read()) != -1) {
                System.out.print((char) symbol);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Помилка роботи з файлом");
        }

    }
}